package strategyPattern.case1;

public class TransportationApplication {
  public static void main(String[] args) {
    TransportationStrategyImpl myHome = new MyHome();
    TransportationStrategyImpl myCompany = new MyCompany();

    // 집에서는 버스를 타고
    myHome.setTransportationStrategy(new BusStrategy());
    myHome.takeTransportation();

    // 회사에서는 지하철을 탐
    myCompany.setTransportationStrategy(new TrainStrategy());
    myCompany.takeTransportation();

    // 집에서 지하철타기 가능
    myHome.setTransportationStrategy(new TrainStrategy());
    myHome.takeTransportation();
  }
}
