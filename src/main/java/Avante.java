public class Avante extends Car{

  private int tripDistance;
  private String name;

  public Avante(int tripDistance) {
    this.tripDistance = tripDistance;
    this.name = "Avante";
  }

  @Override
  double getDistancePerLiter() {
    return 15;
  }

  @Override
  double getTripDistance() {
    return tripDistance;
  }

  @Override
  String getName() {
    return name;
  }
}
