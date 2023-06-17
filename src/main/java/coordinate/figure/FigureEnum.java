package coordinate.figure;

import java.util.HashMap;
import java.util.Map;

public enum FigureEnum {
  LINE(2, "두 점 사이 거리는 ")
  , TRIANGLE(3, "삼각형 넓이는 ")
  , RECTANGLE(4, "사각형 넓이는 ")
  ;

  private int pointCount;
  private String areaSentence;

  public int getPointCount() {
    return pointCount;
  }

  public String getAreaSentence() {
    return areaSentence;
  }

  FigureEnum(int pointCount, String areaSentence) {
    this.pointCount = pointCount;
    this.areaSentence = areaSentence;
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
