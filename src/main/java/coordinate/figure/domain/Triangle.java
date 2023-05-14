package coordinate.figure.domain;

import coordinate.point.domain.Point;
import java.util.List;

public class Triangle extends Figure {

  public Triangle(List<Point> points) {
    super(points);
  }

  @Override
  public double getSize() {
    double x = getXLength();
    double y = getYLength();
    double z = getZLength();
    double s = (x + y + z) / 2.0;
    return Math.sqrt(s * (s-x) * (s-y) * (s-z));
  }

  private double getXLength() {
    return super.getLineLength(points.get(0), points.get(1));
  }

  private double getYLength() {
    return super.getLineLength(points.get(1), points.get(2));
  }

  private double getZLength() {
    return super.getLineLength(points.get(2), points.get(0));
  }

}
