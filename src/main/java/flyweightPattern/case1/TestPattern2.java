package flyweightPattern.case1;

public class TestPattern2 {
  public static void main(String[] args) {

    Mydata md1 = new Mydata();
    md1.xpos = 10;
    md1.ypos = 11;
    md1.name = "기뮤링";

    Mydata md2 = new Mydata();
    md2 = md1;

    Mydata md3 = new Mydata();
    md3.xpos = 20;
    md3.ypos = 21;
    md3.name = "리유깅";

    md2.name = "리리뮤뮤";
    md2.xpos = 5;


  }
}

class Mydata {
  int xpos;
  int ypos;
  String name;
}
