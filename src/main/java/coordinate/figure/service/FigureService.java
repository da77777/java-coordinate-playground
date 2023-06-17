package coordinate.figure.service;

import coordinate.figure.FigureEnum;
import coordinate.figure.domain.Figure;
import coordinate.figure.domain.Line;
import coordinate.figure.domain.Rectangle;
import coordinate.figure.domain.Triangle;
import coordinate.figure.dto.FigureResult;
import coordinate.point.domain.Point;
import java.util.List;

public class FigureService {

  public FigureResult getFigureResult(List<Point> points) {

    FigureEnum figureEnum = findFigureEnum(points);
    double size = getSize(points);

    return new FigureResult(figureEnum, size, points);
  }

  public FigureEnum findFigureEnum(List<Point> points) {
    return FigureEnum.findByPointCount(points.size());
  }

  public double getSize(List<Point> points) {
    Figure figure = createByPointsCount(points);
    return figure.getArea();
  }

  public Figure createByPointsCount(List<Point> points) {
    FigureEnum figureEnum = findFigureEnum(points);

    if(figureEnum.equals(FigureEnum.LINE)) {
      return new Line(points);
    }

    if(figureEnum.equals(FigureEnum.TRIANGLE)) {
      return new Triangle(points);
    }

    return new Rectangle(points);
  }

}
