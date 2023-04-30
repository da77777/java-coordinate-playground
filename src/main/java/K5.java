public class K5 extends Car{

  private int tripDistance;
  private String name;

  public K5(int tripDistance) {
    this.tripDistance = tripDistance;
    this.name = "K5";
  }

  @Override
  double getDistancePerLiter() {
    return 13;
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
