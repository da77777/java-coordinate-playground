package coordinate.figure.service;

import coordinate.figure.FigureEnum;
import coordinate.figure.domain.*;
import coordinate.figure.dto.FigureResult;
import coordinate.point.domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureService {

  private static Map<Integer, FigureCreator> figureBox = new HashMap<>();
  static {
    figureBox.put(FigureEnum.LINE.getPointCount(), Line::new); //Line::new : create 메서드 구현체
    figureBox.put(FigureEnum.TRIANGLE.getPointCount(), Triangle::new);
    figureBox.put(FigureEnum.RECTANGLE.getPointCount(), Rectangle::new);
  }

  public FigureResult getFigureResult(List<Point> points) {
    Figure figure = createFigure(points);
    return new FigureResult(figure, points); // 확인
  }

  public Figure createFigure(List<Point> points) {
    Figure figure = null;
    FigureCreator figureCreator = figureBox.get(points.size());
    if(figureCreator != null) {
      figure = figureCreator.create(points);
    }
    return figure; //확인
  }

}
