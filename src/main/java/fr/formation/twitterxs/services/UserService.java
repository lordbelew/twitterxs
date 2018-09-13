package fr.formation.twitterxs.services;

import fr.formation.twitterxs.dto.UserCreateDTO;

public interface UserService {

  public String create(UserCreateDTO dto);

  public String delete(Long id);

}
