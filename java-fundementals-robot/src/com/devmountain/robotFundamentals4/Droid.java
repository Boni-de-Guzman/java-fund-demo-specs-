package com.devmountain.robotFundamentals4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Droid {

  private final String serialNumber;
  private final Model model;
  protected final List<Tool> tools;

  public Droid(String serialNumber, Model model, List<Tool> tools) {
    this.serialNumber = serialNumber;
    this.model = model;
    this.tools = tools.stream().map(Tool::new).collect(Collectors.toList());
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public List<Tool> getTools() {
    return tools;
  }

  public Model getModel() {
    return model;
  }


  protected void speak(){
    System.out.println("beep beep boop boop!");
  }

  @Override
  public String toString() {
    return "Droid{" +
        "serialNumber='" + serialNumber + '\'' +
        ", model=" + model +
        ", tools=" + tools +
        '}';
  }
}
