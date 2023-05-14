package coordinate.point.domain;

import java.util.HashMap;
import java.util.Map;

public class Point {

  private Integer x;
  private Integer y;

  public Integer getX() {
    return x;
  }

  public Integer getY() {
    return y;
  }

  public Point() {
  }

  public Point(String[] point) {
    Map<String, Integer> pointMap = validPoint(point);
    if(!pointMap.isEmpty()) {
      this.x = pointMap.get("x");
      this.y = pointMap.get("y");
    }
  }

  private Map<String, Integer> validPoint(String[] point){
    Map<String, Integer> pointMap = new HashMap<>();
    try {
      int pointX = Integer.parseInt(point[0]);
      int pointY = Integer.parseInt(point[1]);
      checkLimit(pointX, pointY);
      pointMap.put("x", pointX);
      pointMap.put("y", pointY);
      return pointMap;
    } catch (RuntimeException e) {
      System.out.println("24이하의 숫자만 입력해주세요.");
      return pointMap;
    }
  }


  private void checkLimit(int x, int y) {
    if(x > 24 || y > 24) {
      throw new IllegalArgumentException();
    }
  }

  public boolean hasValue() {
    return (this.x != null && this.y != null);
  }

}
