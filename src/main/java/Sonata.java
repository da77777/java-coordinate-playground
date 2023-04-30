public class Sonata extends Car{

  private int tripDistance;
  private String name;

  public Sonata(int tripDistance) {
    this.tripDistance = tripDistance;
    this.name = "Sonata";
  }

  @Override
  double getDistancePerLiter() {
    return 10;
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
