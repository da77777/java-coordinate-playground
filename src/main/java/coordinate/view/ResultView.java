package coordinate.view;

import coordinate.figure.dto.FigureResult;
import coordinate.point.domain.Point;
import java.util.List;

public class ResultView {

  private ResultView() {
  }

  public static void printResult(FigureResult result) {
    drawCoordinates(result.getPoints());
    result(result);
  }

  private static void result(FigureResult result) {
    System.out.println(result.getFigureEnum().getAreaSentence() + result.getSize());
  }

  private static void drawCoordinates(List<Point> points) {
    int limit = 24;
    char empty = ' ';
    char[][] grid = new char[limit + 1][limit + 1];

    // Initialize grid with empty spaces
    for (char[] row : grid) {
      for (int i = 0; i < row.length; i++) {
        row[i] = empty;
      }
    }

    // Mark points on the grid
    for (Point point : points) {
      int x = point.getX();
      int y = point.getY();
        grid[y][x] = 'o';
    }

    // Draw the coordinates
    char heightLine = '|';
    for (int y = limit; y > 0; y--) {
      // Draw y-axis labels
      if(y % 2 == 0) {
        System.out.printf("%2d%s", y, heightLine);
      } else {
        System.out.printf("%3s", heightLine);
      }

      // Draw the row
      for (int x = 0; x <= limit; x++) {
        System.out.print(grid[y][x]);
        System.out.print(empty);
      }
      System.out.println();
    }

    // Draw x-axis labels
    lastLine(limit);
    System.out.println();
  }

  private static void lastLine(int limit) {
    char widthLine = '―';

    System.out.printf("%3s", "+");
    StringBuilder width = new StringBuilder();
    for(int j = 0; j < limit + 6; j++) {
      width.append(widthLine);
    }
    System.out.println(width);

    for(int j = 1; j <= limit; j++) {
      if(j == 1) {
        System.out.printf("%2d", 0);
      } else if(j == 2) {
        System.out.printf("%6d", j);
      } else if(j % 2 == 0) {
        System.out.printf("%4d", j);
      }
    }
    System.out.println();
  }

}
