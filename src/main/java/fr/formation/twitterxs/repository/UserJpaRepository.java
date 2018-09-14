package fr.formation.twitterxs.repository;

import fr.formation.twitterxs.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {

  User findBySecurityUsername(String username);
}
