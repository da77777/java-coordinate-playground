package coordinate.view;

import java.util.Scanner;

public class InputView {

  private static InputView inputView = getInstance();

  public static final InputView getInstance() {
    if(inputView == null) {
      return new InputView();
    }
    return inputView;
  }

  private final Scanner sc = new Scanner(System.in);

  public String inputAnswer() {
    return sc.nextLine();
  }

  public void inputPoints() {
    System.out.println("좌표를 입력하세요.");
  }

  public void close() {
    sc.close();
  }

}
