package builderPattern.case2;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class PersonBuilder {
  private String firstName;
  private String lastName;
  private LocalDate birthDay;
  private String addressOne;
  private String addressTwo;
  private String gender;
  private boolean driverLicense;
  private boolean married;
}
