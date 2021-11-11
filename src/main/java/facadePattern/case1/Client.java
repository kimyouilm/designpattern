package facadePattern.case1;

public class Client {
  public static void main(String[] args) {
    FacadeService facadeService = new FacadeService();
    facadeService.operate("Client");
  }
}
