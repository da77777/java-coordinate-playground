package coordinate;

import coordinate.figure.dto.FigureResult;
import coordinate.figure.service.FigureService;
import coordinate.point.domain.Point;
import coordinate.point.service.PointService;
import coordinate.share.RepairString;
import coordinate.view.InputView;
import coordinate.view.ResultView;
import java.util.ArrayList;
import java.util.List;

public class CoordinateApplication {

  public static void main(String[] args) {
    InputView inputView = InputView.getInstance();
    PointService pointService = new PointService();
    FigureService figureService = new FigureService();

    inputView.inputPoints();

    List<Point> points = new ArrayList<>();
    boolean success = false;
    while(success == false) {
      String[] splitAnswer = RepairString.removeBracketAndHyphen(inputView.inputAnswer());
      success = pointService.addPoints(points, splitAnswer);
    }
    inputView.close();

    FigureResult result = figureService.getFigure(points);
    ResultView.drawCoordinates(points);
    ResultView.result(result);
  }

}
