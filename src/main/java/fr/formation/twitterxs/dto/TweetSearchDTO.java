package fr.formation.twitterxs.dto;

public class TweetSearchDTO {

  private String username;

  private int page;

  private int size;

  public TweetSearchDTO() {
  }

  public TweetSearchDTO(String username, int page, int size) {
    this.username = username;
    this.page = page;
    this.size = size;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }


}
