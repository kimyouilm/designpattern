package strategyPattern.case1;

public class TransportationStrategyImpl {
  private TransportationStrategy transportationStrategy;

  public void takeTransportation() {
    transportationStrategy.takeTransportation();
  }
  public void setTransportationStrategy(TransportationStrategy transportationStrategy) {
    this.transportationStrategy = transportationStrategy;
  }
}
