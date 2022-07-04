package com.devmountain.robotFundamentals4;

public class Model {
  private final String type;
  private final String purpose;

  public Model(String modelName, String purpose) {
    this.type = modelName;
    this.purpose = purpose;
  }

  public String getType() {
    return type;
  }

  public String getPurpose() {
    return purpose;
  }

  @Override
  public String toString() {
    return "Model{" +
        "modelName='" + type + '\'' +
        ", purpose='" + purpose + '\'' +
        '}';
  }
}
