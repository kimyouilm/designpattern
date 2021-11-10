package adapaterPattern.objectPattern;
// Adaptee에 해당하는 클래스
public class Banner {
  private String str;

  public Banner(String str) {
    this.str = str;
  }

  public void printBanner() {
    System.out.println("(" + str + ")");
  }
}
