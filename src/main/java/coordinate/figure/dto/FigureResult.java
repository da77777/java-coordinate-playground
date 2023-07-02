package coordinate.figure.dto;

import coordinate.figure.FigureEnum;
import coordinate.figure.domain.Figure;
import coordinate.point.domain.Point;

import java.util.List;

import static coordinate.figure.FigureEnum.findByPointCount;

public class FigureResult {

  private Figure figure;
  private List<Point> points;

  public FigureResult(Figure figure, List<Point> points) {
    this.figure = figure;
    this.points = points;
  }

  public Figure getFigure() {
    return figure;
  }

  public List<Point> getPoints() {
    return points;
  }

  public FigureEnum getFigureEnum() {
    return findByPointCount(points.size());
  }

}
