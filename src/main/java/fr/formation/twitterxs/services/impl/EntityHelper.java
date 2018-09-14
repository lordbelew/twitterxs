package fr.formation.twitterxs.services.impl;

import fr.formation.twitterxs.domain.entities.Region;
import fr.formation.twitterxs.domain.entities.Tweet;
import fr.formation.twitterxs.domain.entities.User;
import fr.formation.twitterxs.domain.entities.UserSecurity;
import fr.formation.twitterxs.dto.RegionCreateDTO;
import fr.formation.twitterxs.dto.TweetCreateDTO;
import fr.formation.twitterxs.dto.UserCreateDTO;
import java.time.LocalDateTime;

final class EntityHelper {

  static Region asRegion(RegionCreateDTO dto) {
    Region entity = new Region();
    entity.setLanguage(dto.getLanguage());
    entity.setCountry(dto.getCountry());
    return entity;
  }

  static Tweet asTweet(TweetCreateDTO dto, User author) {
    Tweet tweet = new Tweet();
    tweet.setAuthor(author);
    tweet.setEditDate(LocalDateTime.now());
    tweet.setPostDate(LocalDateTime.now());
    tweet.setContent(dto.getContent());
    return tweet;
  }

  static User asUser(UserCreateDTO dto, Region region) {
    User user = new User();
    user.setFirstname(dto.getFirstname());
    user.setLastname(dto.getLastname());
    user.setRegion(region);
    user.setBirthDate(dto.getBirthdate());
    user.setEmail(dto.getEmail());
    user.setSubscriptionDate(LocalDateTime.now());

    UserSecurity secu = new UserSecurity();
    secu.setPassword(dto.getPassword());
    secu.setUsername(dto.getUsername());
    user.setSecurity(secu);

    return user;
  }

}
