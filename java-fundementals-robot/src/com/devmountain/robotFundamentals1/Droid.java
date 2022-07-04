package com.devmountain.robotFundamentals1;

public class Droid {

  private String serialNumber;
  private Model model;

  public Droid(String serialNumber, Model model) {
    this.serialNumber = serialNumber;
    this.model = model;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public void speak(){
    System.out.println("beep beep boop boop!");
  }

  @Override
  public String toString() {
    return "Droid{" +
        "serialNumber='" + serialNumber + '\'' +
        ", model=" + model +
        '}';
  }
}
