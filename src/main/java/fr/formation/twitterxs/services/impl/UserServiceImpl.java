package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.dto.UserCreateDTO;
import fr.formation.twitterxs.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


  @Override
  public String create(UserCreateDTO userDTO) {
    return userDTO.getEmail();
  }

  @Override
  public String delete(Long id) {
    return "DELETED ID = " + id;
  }
}
