package com.devmountain.robotFundamentals3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Droid {

  private final String serialNumber;
  private final Model model;
  private final List<Tool> tools;

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

  public void repairStarship() {
    Optional<Tool> repairToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() >= 1).findFirst();
    if(repairToolOptional.isPresent()){
      Tool repairTool = repairToolOptional.get();
      repairTool.useTool();
      System.out.println("Starship Repaired");
      if(repairTool.getDurability() == 0){
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
