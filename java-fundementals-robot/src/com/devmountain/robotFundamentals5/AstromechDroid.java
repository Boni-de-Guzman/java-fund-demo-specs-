package com.devmountain.robotFundamentals5;

import java.util.List;
import java.util.Optional;

public class AstromechDroid extends Droid {
  public AstromechDroid(String serialNumber, Model model, List<Tool> tools) {
    super(serialNumber, model, tools);
  }

  public void repairStarship() {
    Optional<Tool> repairToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() >= 1).findFirst();
    if(repairToolOptional.isPresent()){
      Tool repairTool = repairToolOptional.get();
      System.out.println("Starship Repaired");
      repairTool.useTool();
      if(repairTool.getDurability() == 0){
        tools.remove(repairTool);
      }
    } else {
      System.out.println("No tool available, starship still needs repairs.");
    }
  }
}
