package coordinate.point.service;

import coordinate.point.domain.Point;
import coordinate.share.RepairString;
import java.util.List;

public class PointService {

  public boolean addPoints(List<Point> points, String[] splitAnswer) {
    if(!validPointCount(splitAnswer)){
      return false;
    }

    for (String s : splitAnswer) {
      addPoint(new Point(RepairString.removeComma(s)), points);
    }

    if(points.size() != splitAnswer.length) {
      return false;
    }

    return true;
  }

  public void addPoint(Point point, List<Point> points) {
    if (point.hasValue()) {
      points.add(point);
    } else {
      points.clear();
    }
  }

  public boolean validPointCount(String[] splitAnswer) {
    if(splitAnswer.length < 2 || splitAnswer.length > 4) {
      System.out.println("좌표는 2개 이상, 4개 이하로 입력해주세요.");
      return false;
    }
    return true;
  }

}
