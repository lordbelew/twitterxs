package fr.formation.twitterxs.dto;

import java.util.List;

public class SearchResultDTO<E> {

  private List<E> items;

  private Long totalelements;


  public SearchResultDTO() {
  }

  public SearchResultDTO(List<E> items, Long totalelements) {
    this.items = items;
    this.totalelements = totalelements;
  }

  public List<E> getItems() {
    return items;
  }

  public void setItems(List<E> items) {
    this.items = items;
  }

  public Long getTotalelements() {
    return totalelements;
  }

  public void setTotalelements(Long totalelements) {
    this.totalelements = totalelements;
  }
}
