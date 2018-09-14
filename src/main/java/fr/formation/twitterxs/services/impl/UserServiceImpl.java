package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.domain.entities.Region;
import fr.formation.twitterxs.domain.entities.User;
import fr.formation.twitterxs.dto.UserCreateDTO;
import fr.formation.twitterxs.dto.UserUpdatePasswordDTO;
import fr.formation.twitterxs.repository.RegionJpaRepository;
import fr.formation.twitterxs.repository.UserJpaRepository;
import fr.formation.twitterxs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  RegionJpaRepository regionJpaRepository;

  @Autowired
  UserJpaRepository userJpaRepository;

  @Autowired
  PasswordEncoder encoder;


  @Override
  public void create(UserCreateDTO userDTO) {
    Region region = regionJpaRepository.findById(userDTO.getRegionId()).get();
    User user = EntityHelper.asUser(userDTO, region);
    String pwd = user.getSecurity().getPassword();
    String encoded = encoder.encode(pwd);
    user.getSecurity().setPassword(encoded);

    userJpaRepository.save(user);
  }

  @Override
  public String updatePassword(UserUpdatePasswordDTO dto) {
    return "PASSWORD : " + dto.getPassword();
  }

  @Override
  public String delete(Long id) {
    return "DELETED ID = " + id;
  }
}
