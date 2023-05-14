package point.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import coordinate.point.domain.Point;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PointTest {

  @ParameterizedTest
  @CsvSource(value = {"0:25:false", "25:0:false", "가:0:false", "0:가:false"
      , "0:24:true", "24:0:true"}, delimiter = ':')
  void validPoint(String x, String y, boolean expected) {
    String[] point = new String[]{x, y};
    Point p = new Point(point);
    boolean success = p.hasValue();

    assertEquals(expected, success);
  }

}
