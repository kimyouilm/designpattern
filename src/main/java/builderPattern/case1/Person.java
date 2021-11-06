package builderPattern.case1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Observer;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String firstName;
  private String lastName;
  private LocalDate birthDay;
  private String addressOne;
  private String addressTwo;
  private String gender;
  private boolean driverLicense;
  private boolean married;

}
