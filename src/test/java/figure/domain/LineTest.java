package figure.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import coordinate.figure.domain.Line;
import coordinate.point.domain.Point;
import coordinate.share.RepairString;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LineTest {

  @Test
  void getSize() {
    String answer = "(10,10)-(14,15)";
    String[] splitAnswer = RepairString.removeBracketAndHyphen(answer);

    List<Point> points = new ArrayList<>();
    for (String s : splitAnswer) {
      points.add(new Point(RepairString.removeComma(s)));
    }

    Line line = new Line(points);
    double result = line.getSize();
    assertEquals(6.403124, result, 0.001);

  }
}
