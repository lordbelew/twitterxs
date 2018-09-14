package fr.formation.twitterxs.dto;

import java.time.LocalDateTime;

public class TweetDTO {

  private Long tweetId;

  private LocalDateTime postDate;

  private String content;

  public TweetDTO() {
  }

  public TweetDTO(Long tweetId, LocalDateTime postDate, String content) {
    this.tweetId = tweetId;
    this.postDate = postDate;
    this.content = content;
  }

  public Long getTweetId() {
    return tweetId;
  }

  public void setTweetId(Long tweetId) {
    this.tweetId = tweetId;
  }

  public LocalDateTime getPostDate() {
    return postDate;
  }

  public void setPostDate(LocalDateTime postDate) {
    this.postDate = postDate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
