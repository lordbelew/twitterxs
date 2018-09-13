package fr.formation.twitterxs.dto;

import fr.formation.twitterxs.errors.Adult;
import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreateDTO {

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 100, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String lastname;

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 100, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String firstname;

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 255, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String email;

  @Adult(age = 20)
  @NotNull(message = "{E_NOT_NULL}")
  private LocalDate birthdate;

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 50, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String username;

  @NotBlank(message = "{E_NOT_BLANK}")
  @Size(max = 100, message = "{E_MAX_LENGTH_EXCEDEED}")
  private String password;

  private Long regionId;

  public UserCreateDTO() {

  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

}
