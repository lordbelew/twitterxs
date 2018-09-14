package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.dto.UserCreateDTO;
import fr.formation.twitterxs.dto.UserUpdatePasswordDTO;
import fr.formation.twitterxs.services.UserService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userservice;

  public UserController(UserService userService) {
    this.userservice = userService;
  }

  @PostMapping("/create")
  protected void createUser(@RequestBody @Valid UserCreateDTO user) {
    userservice.create(user);
  }

  @PutMapping("/updatePassword")
  protected String updatePassword(@RequestBody @Valid UserUpdatePasswordDTO user) {
    return userservice.updatePassword(user);
  }
}
