package adapaterPattern.objectPattern;

// Adapter
// Object Adapter일 경우
public class PrintBanner implements Print {

  Banner banner;

  public PrintBanner(String str) {
    banner = new Banner(str);
  }

  @Override
  public void printWeak() {
    banner.printBanner();
  }

  @Override
  public void printStrong() {
    System.out.println("======================");
    banner.printBanner();
    System.out.println("======================");
  }
}
