package fr.formation.twitterxs.dto;

public class RegionCreateDTO {

  private String language;
  private String country;


  public RegionCreateDTO() {
  }

  public RegionCreateDTO(String language, String country) {
    setLanguage(language);
    setCountry(country);
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
