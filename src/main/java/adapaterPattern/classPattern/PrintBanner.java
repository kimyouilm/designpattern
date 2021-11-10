package adapaterPattern.classPattern;
// Adapter
// Banner 클래스를 상속 받았기 때문에 인스턴스 없이 printBanner() 메소드를 사용할 수 있다구~
public class PrintBanner extends Banner implements Print{

  public PrintBanner(String str) {
    super(str);
  }

  @Override
  public void printWeak() {
    printBanner();
  }

  @Override
  public void printStrong() {
    System.out.println("======================");
    printBanner();
    System.out.println("======================");
  }
}
