package fr.formation.twitterxs.controllers;

import fr.formation.twitterxs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private UserService userService;


  @DeleteMapping("/deleteUser/{id}")
  protected String deleteUser(@PathVariable("id") Long id) {
    return userService.delete(id);
  }

}
