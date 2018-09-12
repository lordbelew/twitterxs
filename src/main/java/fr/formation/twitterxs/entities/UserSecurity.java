package fr.formation.twitterxs.entities;

import fr.formation.twitterxs.domain.BooleanConverter;
import fr.formation.twitterxs.entities.User.Role;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class UserSecurity  implements Serializable {

  @Column(length = 50, nullable = false, unique = true, updatable = false)
  private String username;

  @Column(length = 100, nullable = false)
  private String password;

  @Enumerated(EnumType.STRING)
  @Column(length = 10, nullable = false)
  private Role role = Role.getDefault();

  @Convert(converter = BooleanConverter.class)
  @Column(length = 1, nullable = false)
  public boolean accountNonExpired = true;
}
