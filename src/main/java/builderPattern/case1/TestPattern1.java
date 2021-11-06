package builderPattern.case1;

import builderPattern.case2.PersonBuilder;

import java.time.LocalDate;
import java.time.Month;
import java.util.Observable;

// dot chain pattern
// Member customer = Member.builder()
//   .name("리뮤깅")
//   .age(20)
//   .build();
public class TestPattern1 {
  public static void main(String[] args) {
    PersonBuilder p1 = PersonBuilder
        .builder()
        .firstName("Lima")
        .lastName("Kim")
        .addressOne("주소1")
        .addressTwo("주소2")
        .birthDay(LocalDate.of(1993, Month.OCTOBER, 16))
        .gender("female")
        .driverLicense(true)
        .married(false)
        .build();

    System.out.println(p1.getAddressOne());
  }
}
