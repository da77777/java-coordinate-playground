package figure.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import coordinate.figure.FigureEnum;
import coordinate.figure.dto.FigureResult;
import coordinate.figure.service.FigureService;
import coordinate.point.domain.Point;
import coordinate.share.RepairString;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FigureServiceTest {

  private FigureService figureService = new FigureService();

  @ParameterizedTest
  @CsvSource(value = {"2:LINE", "3:TRIANGLE", "4:RECTANGLE"}, delimiter = ':')
  void findFigure(int value, FigureEnum expected) {
    List<Point> points = new ArrayList<>();
    for(int i = 0; i < value; i++) {
      points.add(new Point());
    }
    FigureEnum figure = figureService.findFigure(points);

    assertEquals(expected, figure);
  }

  @ParameterizedTest
  @CsvSource(value = {"(10,10)-(14,15):6.403124"
      , "(10,10)-(22,10)-(22,18)-(10,18):96"
      , "(10,10)-(14,15)-(20,8):29.0"}, delimiter = ':')
  void getSize(String value, double expected) {
    String[] splitAnswer = RepairString.removeBracketAndHyphen(value);
    List<Point> points = new ArrayList<>();
    for (String s : splitAnswer) {
      String[] split = s.split(",");
      points.add(new Point(split));
    }
    FigureResult result = figureService.getFigure(points);

    assertEquals(expected, result.getSize(), 0.001);
  }


}

