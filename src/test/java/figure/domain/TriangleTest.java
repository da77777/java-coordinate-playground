package figure.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import coordinate.figure.domain.Triangle;
import coordinate.point.domain.Point;
import coordinate.share.RepairString;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TriangleTest {

  @Test
  void getSize() {
    String answer = "(10,10)-(14,15)-(20,8)";
    String[] splitAnswer = RepairString.removeBracketAndHyphen(answer);

    List<Point> points = new ArrayList<>();
    for (String s : splitAnswer) {
      points.add(new Point(RepairString.removeComma(s)));
    }

    Triangle triangle = new Triangle(points);
    double result = triangle.getSize();
    assertEquals(29.0, result, 0.001);
  }

}
