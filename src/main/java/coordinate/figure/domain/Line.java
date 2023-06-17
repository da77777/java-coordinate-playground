package coordinate.figure.domain;

import coordinate.point.domain.Point;
import java.util.List;

public class Line extends Figure {

  public Line(List<Point> points) {
    super(points);
  }

  @Override
  public double getArea() {
    return super.getLineLength(points.get(0), points.get(1));
  }

}
