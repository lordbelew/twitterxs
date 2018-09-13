package fr.formation.twitterxs.errors;

import java.time.LocalDate;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AdultValidator implements ConstraintValidator<Adult, LocalDate> {

  private int age;


  @Override
  public void initialize(Adult parameters) {
    age = parameters.age();
    if (age < 0) {
      throw new IllegalArgumentException("Tu sembles dans le negatif coco");
    }
  }

  // @SuppressWarnings("unused")
  @Override
  public boolean isValid(LocalDate birthDate,
      ConstraintValidatorContext constraintValidatorContext) {
    if (birthDate == null) {
      return true;
    }
    return LocalDate.now().minusYears(age).isAfter(birthDate);
  }
}
