package figure.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import coordinate.point.domain.Point;
import coordinate.figure.domain.Rectangle;
import coordinate.share.RepairString;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RectangleTest {

  @Test
  void getSize() {
    String answer = "(10,10)-(22,10)-(22,18)-(10,18)";
    String[] splitAnswer = RepairString.removeBracketAndHyphen(answer);

    List<Point> points = new ArrayList<>();
    for (String s : splitAnswer) {
      points.add(new Point(RepairString.removeComma(s)));
    }

    Rectangle rectangle = new Rectangle(points);
    double result = rectangle.getArea();
    assertEquals(96, result, 0.001);

  }


}
