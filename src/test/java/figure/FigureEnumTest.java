package figure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import coordinate.figure.FigureEnum;
import org.junit.jupiter.api.Test;

public class FigureEnumTest {

  @Test
  void temp() {
    assertEquals(FigureEnum.LINE, FigureEnum.findByPointCount(2));
    assertEquals(FigureEnum.TRIANGLE, FigureEnum.findByPointCount(3));
    assertEquals(FigureEnum.RECTANGLE, FigureEnum.findByPointCount(4));
  }

}
