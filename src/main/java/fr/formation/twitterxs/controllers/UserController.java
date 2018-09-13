package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.dto.UserCreateDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping("/create")
  protected String createUser(@RequestBody UserCreateDTO user) {
    return user.getEmail();
  }
}
