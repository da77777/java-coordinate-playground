package coordinate.figure.domain;

import coordinate.point.domain.Point;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points);
}
