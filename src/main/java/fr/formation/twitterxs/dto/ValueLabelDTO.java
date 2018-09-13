package fr.formation.twitterxs.dto;

public class ValueLabelDTO {

  private Object value;

  private String label;

  public ValueLabelDTO() {

  }

  public ValueLabelDTO(Object value, String label) {
    setValue(value);
    setLabel(label);
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


}
