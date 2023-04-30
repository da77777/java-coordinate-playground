import java.util.ArrayList;
import java.util.List;

public class RentCompany {

  private List<Car> carList = new ArrayList<>();
  private static final String NEWLINE = System.getProperty("line.separator");

  public static RentCompany create() {
    return new RentCompany();
  }

  public void addCar(Car car) {
    carList.add(car);
  }

  public String generateReport() {
    String report = "";
    for (Car car : carList) {
      report += (car.getName() + " : " + (int)car.getChargeQuantity() + "리터" + NEWLINE);
    }
    return report;
  }


}
