package fr.formation.twitterxs.dto;

import fr.formation.twitterxs.errors.ConfirmPassword;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@ConfirmPassword
public class UserUpdatePasswordDTO {

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 10, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String password;

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 10, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String confirmPassword;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }
}
