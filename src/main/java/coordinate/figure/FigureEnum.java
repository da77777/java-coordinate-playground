package coordinate.figure;

import java.util.HashMap;
import java.util.Map;

public enum FigureEnum {
  LINE(2)
  , TRIANGLE(3)
  , RECTANGLE(4)
  ;

  private int pointCount;

  public int getPointCount() {
    return pointCount;
  }

  FigureEnum(int pointCount) {
    this.pointCount = pointCount;
  }

  private static final Map<Integer, FigureEnum> figureEnumMap = new HashMap<>();
  static {
    for (FigureEnum figure : FigureEnum.values()) {
      figureEnumMap.put(figure.getPointCount(), figure);
    }
  }
  public static FigureEnum findByPointCount(int pointCount) {
    return figureEnumMap.get(pointCount);
  }


}
