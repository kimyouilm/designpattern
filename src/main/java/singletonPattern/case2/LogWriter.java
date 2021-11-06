package singletonPattern.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {
  private static LogWriter singleton = new LogWriter();
  private static BufferedWriter bw;

  private LogWriter() {
    try {
      bw = new BufferedWriter(new FileWriter("log.txt"));
    } catch (Exception e) {

    }
  }

  public static LogWriter getInstance() {
    return singleton;
  }

  // log작성 메서드
  // "long.txt" 하나의 파일에 작성하는 것이기 때문에 여러개의 스레드에서 동시에 부르더라도
  // 로그가 제대로 작성 되게 synchronized 예약어 추가
  public synchronized void log(String str) {
    try {
      // 현재 날짜와 시각 추가
      // bw.write(LocalDateTime.now() + ":" + str + "\n");
      bw.write(str + "\n");
      bw.flush();
    } catch (Exception e) {
      // e.printStackTrace();
    }
  }

  @Override
  protected void finalize(){
    try {
      super.finalize();
      bw.close();
    } catch (Throwable ex) {

    }
  }
}
