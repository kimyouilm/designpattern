package singletonPattern.case2;

public class TestPattern1 {
  public static void main(String[] args) {
    LogWriter logger;

    logger = LogWriter.getInstance();
    logger.log("리뮤김");

    logger = LogWriter.getInstance();
    logger.log("기뮤림");
  }
}
