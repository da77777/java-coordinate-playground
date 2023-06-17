package coordinate.figure.dto;

import coordinate.figure.FigureEnum;
import coordinate.point.domain.Point;

import java.util.List;

public class FigureResult {
  private FigureEnum figureEnum;
  private double size;
  private List<Point> points;

  public FigureResult(FigureEnum figureEnum, double size, List<Point> points) {
    this.figureEnum = figureEnum;
    this.size = size;
    this.points = points;
  }

  public FigureEnum getFigureEnum() {
    return figureEnum;
  }

  public double getSize() {
    return size;
  }

  public List<Point> getPoints() {
    return points;
  }
}
