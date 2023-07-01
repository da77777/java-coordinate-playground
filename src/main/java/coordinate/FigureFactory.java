package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {

    private static final Map<Integer, FigureCreator> figureBox = new HashMap<>();

    static {
        figureBox.put(Line.LINE_POINT_SIZE, Line::new);
        figureBox.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        figureBox.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);
    }

    static Figure getInstance(List<Point> points) {
        FigureCreator figureCreator = figureBox.get(points.size());
        if(figureCreator != null) {
            return figureCreator.create(points);
        }
        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
