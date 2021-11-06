package singletonPattern.case1;

// DAO 역할
public class Database {
  private static Database singleton = new Database("products");
  private String name;

  private Database(String name) {
//    this.name = name;
    try {
      Thread.sleep(100);
      this.name = name;
    } catch (Exception e) {

    }
  }

  // private static Database singleton;
/*  // synchronized => 병목현상 발생
  public synchronized static Database getInstance(String name) {
    // 기존의  singleton을 사용하면 들어가지 않음!
    // TestPattern2에서는 for문이 빠르게 돌기때문에 거의 동시에 들어왔다고 판단해서 null이라고 생각된거임
    if (singleton == null) {
      singleton = new Database(name);
//      System.out.println(singleton);
    }
    return singleton;
  }*/

  // private static Database singleton = new Database("products");
  public static Database getInstance(String name) {
    return singleton;
  }

  public String getName() {
    return name;
  }


}
