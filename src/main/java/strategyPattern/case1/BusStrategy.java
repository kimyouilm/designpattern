package strategyPattern.case1;

public class BusStrategy implements TransportationStrategy {

  @Override
  public void takeTransportation() {
    System.out.println("버스를 탈꺼야!");
  }
}
