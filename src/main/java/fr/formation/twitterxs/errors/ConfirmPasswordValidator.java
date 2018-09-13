package fr.formation.twitterxs.errors;

import fr.formation.twitterxs.dto.UserUpdatePasswordDTO;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConfirmPasswordValidator implements
    ConstraintValidator<ConfirmPassword, UserUpdatePasswordDTO> {

  @Override
  public boolean isValid(UserUpdatePasswordDTO userUpdatePasswordDTO,
      ConstraintValidatorContext constraintValidatorContext) {
    return userUpdatePasswordDTO.getPassword().equals(userUpdatePasswordDTO.getConfirmPassword());
  }
}
