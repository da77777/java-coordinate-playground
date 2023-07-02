package coordinate.point.service;

import coordinate.point.domain.Point;
import coordinate.share.RepairString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointService {
  private static final int MIN_POINT_COUNT = 2;
  private static final int MAX_POINT_COUNT = 4;

  public List<Point> addPoints(String[] splitAnswer) {
    List<Point> points = new ArrayList<>();

    if(!validPointCount(splitAnswer)) {
      return points;
    }

    points = Arrays.stream(splitAnswer)
            .map(s -> new Point(RepairString.removeComma(s)))
            .filter(Point::hasValue)
            .collect(Collectors.toList());

    if(points.size() != splitAnswer.length) {
      points.clear();
      return points;
    }

    return points;
  }


  public boolean validPointCount(String[] splitAnswer) {
    if(splitAnswer.length < MIN_POINT_COUNT || splitAnswer.length > MAX_POINT_COUNT) {
      System.out.println("좌표는 " + MIN_POINT_COUNT + "개 이상, " + MAX_POINT_COUNT + "개 이하로 입력해주세요.");
      return false;
    }
    return true;
  }

}
