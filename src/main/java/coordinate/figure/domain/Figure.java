package coordinate.figure.domain;

import coordinate.point.domain.Point;
import java.util.List;

public abstract class Figure {

  protected List<Point> points;

  protected Figure(List<Point> points) {
    this.points = points;
  }

  public double getLineLength(Point first, Point second) {
    return Math.sqrt(Math.pow((first.getX() - second.getX()), 2)
        + Math.pow((first.getY() - second.getY()), 2));
  }

  public abstract double getArea();
}
