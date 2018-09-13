package fr.formation.twitterxs.services;

import fr.formation.twitterxs.dto.UserCreateDTO;
import fr.formation.twitterxs.dto.UserUpdatePasswordDTO;

public interface UserService {

  String create(UserCreateDTO dto);

  String updatePassword(UserUpdatePasswordDTO dto);

  String delete(Long id);

}
