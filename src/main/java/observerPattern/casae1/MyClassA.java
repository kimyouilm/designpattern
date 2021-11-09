package observerPattern.casae1;

import java.util.Observable;
import java.util.Observer;

public class MyClassA implements Observer {

  // 등록 될 Observable
  Observable observable;
  // 실행 여부
  private boolean bPlay;

  public MyClassA(Observable observable) {
    this.observable = observable;
    // 옵저버에 현재 클래스를 등록
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {

    if (o instanceof PlayController) {
      PlayController playController = (PlayController) o;
      this.bPlay = playController.getFlag();
      myActControl();
    }
  }

  private void myActControl() {
    if (bPlay) {
      System.out.println("MyClassA: 동작을 시작합니다.");
    } else {
      System.out.println("MyClassA : 동작을 정지합니다.");
    }
  }

}
