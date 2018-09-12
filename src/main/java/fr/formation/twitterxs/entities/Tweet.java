package fr.formation.twitterxs.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"author_id", "postDate"}))
public class Tweet implements Serializable {

  private static final long serialVersionUID = -5772526226721943953L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /*@Version
  @Column(nullable = false)
  private LocalDateTime optLock;*/

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false)
  private User author;

  @Column(nullable = false, updatable = false)
  private LocalDateTime postDate;

  @Column(nullable = false)
  private LocalDateTime editDate;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public LocalDateTime getPostDate() {
    return postDate;
  }

  public void setPostDate(LocalDateTime postDate) {
    this.postDate = postDate;
  }

  public LocalDateTime getEditDate() {
    return editDate;
  }

  public void setEditDate(LocalDateTime editDate) {
    this.editDate = editDate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Column(length = 280, nullable = false)
  private String content;

}
