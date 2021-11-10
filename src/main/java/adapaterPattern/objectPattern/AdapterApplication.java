package adapaterPattern.objectPattern;

// Client
public class AdapterApplication {

  public static void main(String[] args) {
    Print print = new PrintBanner("나는 리마 입니우다다다다");
    System.out.println("=== Weak Banner ===");
    print.printWeak();
    System.out.println("=== Strong Banner ===");
    print.printStrong();
  }
}
