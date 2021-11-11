package facadePattern.case1;

public class FacadeService {
  private final Subsystem1 subsystem1;
  private final Subsystem2 subsystem2;
  private final Subsystem3 subsystem3;


  public FacadeService() {
    this.subsystem1 = new Subsystem1();
    this.subsystem2 = new Subsystem2();
    this.subsystem3 = new Subsystem3();
  }

  public void operate(final String name) {
    subsystem1.doSomething(name);
    subsystem2.doSomething(name);
    subsystem3.doSomething(name);
  }
}
