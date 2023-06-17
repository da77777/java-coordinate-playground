package coordinate.figure.domain;

import coordinate.point.domain.Point;
import java.util.List;

public class Rectangle extends Figure {

  public Rectangle(List<Point> points) {
    super(points);
  }

  @Override
  public double getArea() {
    return getHeight() * getWidth();
  }

  private double getHeight() {
    Point first = points.get(0);
    Point second = points.stream()
        .filter(point -> !first.equals(point) && (first.getX().equals(point.getX())))
        .findFirst()
        .orElse(new Point());
    return super.getLineLength(first, second);
  }

  private double getWidth() {
    Point first = points.get(0);
    Point second = points.stream()
        .filter(point -> !first.equals(point) && (first.getY().equals(point.getY())))
        .findFirst()
        .orElse(new Point());
    return super.getLineLength(first, second);
  }

}
