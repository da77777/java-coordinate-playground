package coordinate.figure.service;

import coordinate.figure.FigureEnum;
import coordinate.figure.domain.Line;
import coordinate.figure.domain.Rectangle;
import coordinate.figure.domain.Triangle;
import coordinate.figure.dto.FigureResult;
import coordinate.point.domain.Point;
import java.util.List;

public class FigureService {

  public FigureResult getFigure(List<Point> points) {

    FigureEnum figure = findFigure(points);
    double size = getSize(points, figure);

    return new FigureResult(figure, size);
  }

  public FigureEnum findFigure(List<Point> points) {
    int count = points.size();
    return FigureEnum.findByPointCount(count);
  }

  public double getSize(List<Point> points, FigureEnum figure) {
    double size = 0;
    if(figure.equals(FigureEnum.LINE)) {
      size = getLineSize(points);
    } else if(figure.equals(FigureEnum.RECTANGLE)) {
      size = getRectangleSize(points);
    } else if(figure.equals(FigureEnum.TRIANGLE)) {
      size = getTriangleSize(points);
    }
    return size;
  }

  private double getLineSize(List<Point> points) {
    Line line = new Line(points);
    return line.getSize();
  }

  private double getRectangleSize(List<Point> points) {
    Rectangle rectangle = new Rectangle(points);
    return rectangle.getSize();
  }

  private double getTriangleSize(List<Point> points) {
    Triangle triangle = new Triangle(points);
    return triangle.getSize();
  }

}
