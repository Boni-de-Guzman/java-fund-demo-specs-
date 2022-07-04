package com.devmountain.robotFundamentals2;

public class Model {
  private String type;
  private String purpose;

  public Model(String modelName, String purpose) {
    this.type = modelName;
    this.purpose = purpose;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  @Override
  public String toString() {
    return "Model{" +
        "modelName='" + type + '\'' +
        ", purpose='" + purpose + '\'' +
        '}';
  }
}
