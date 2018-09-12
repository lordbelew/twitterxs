package fr.formation.twitterxs.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

 //private static final long serialVersionUID = 3607470165921841356L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 100, nullable = false)
  private String lastname;

  @Column(length = 100, nullable = false)
  private String firstname;

  @Column(length = 255, nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private LocalDate birthDate;

  @Column(nullable = false, updatable = false)
  private LocalDateTime subscriptionDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false)
  private Region region;

  @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
  private Set<Tweet> tweets;

  @Embedded
  private UserSecurity security;

/*
  @OneToMany(mappedBy = "liker", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
  private Set<LikedTweet> likedTweets;
  */

public static enum Role {
  ROLE_USER,
  ROLE_ADMIN,
  ROLE_ACTUATOR;

  public static Role getDefault() {
    return ROLE_USER;
  }

  public boolean isUser() {
    return equals(ROLE_USER);
  }
}


  public User() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDateTime getSubscriptionDate() {
    return subscriptionDate;
  }

  public void setSubscriptionDate(LocalDateTime subscriptionDate) {
    this.subscriptionDate = subscriptionDate;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public Set<Tweet> getTweets() {
    return tweets;
  }

  public void setTweets(Set<Tweet> tweets) {
    this.tweets = tweets;
  }
/*
  public Set<LikedTweet> getLikedTweets() {
    return likedTweets;
  }

  public void setLikedTweets(Set<LikedTweet> likedTweets) {
    this.likedTweets = likedTweets;
  }
 */
}
