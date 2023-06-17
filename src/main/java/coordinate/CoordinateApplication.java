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
    while(points.isEmpty()) {
      String[] splitAnswer = RepairString.removeBracketAndHyphen(inputView.inputAnswer());
      points = pointService.addPoints(splitAnswer);
    }
    inputView.close();

    FigureResult result = figureService.getFigureResult(points);
    ResultView.printResult(result);

  }

}
