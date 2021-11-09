package builderPattern.exam2;

import lombok.Builder;

@Builder
public class Member {
  private String lastName;
  private String firstName;
  private int age;
  private String phone;
}
