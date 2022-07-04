package com.devmountain.robotFundamentals2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Droid {

  private String serialNumber;
  private Model model;
  private List<Tool> tools;

  public Droid(String serialNumber, Model model, List<Tool> tools) {
    this.serialNumber = serialNumber;
    this.model = model;
    this.tools = tools;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public List<Tool> getTools() {
    return tools;
  }

  public void setTools(List<Tool> tools) {
    this.tools = tools;
  }

  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public void repairStarship() {
    Optional<Tool> repairToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() >= 1).findFirst();
    if(repairToolOptional.isPresent()){
      Tool repairTool = repairToolOptional.get();
      repairTool.setDurability(repairTool.getDurability() - 1);
      System.out.println("Starship Repaired");
      if(repairTool.getDurability() == 0){
        System.out.println("tool broke");
        tools.remove(repairTool);
      }
    } else {
      System.out.println("No tool available, starship still needs repairs.");
    }
  }

  public void speak(){
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
