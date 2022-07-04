package com.devmountain.robotFundamentals2;

public class Tool {

  private ToolType toolType;
  private int durability;

  public Tool(ToolType toolType) {
    this.toolType = toolType;
    this.durability = 3;
  }

  public ToolType getToolType() {
    return toolType;
  }

  public void setToolType(ToolType toolType) {
    this.toolType = toolType;
  }

  public int getDurability() {
    return durability;
  }

  public void setDurability(int durability) {
    this.durability = durability;
  }

  @Override
  public String toString() {
    return "Tool{" +
        "toolType=" + toolType +
        ", durability=" + durability +
        '}';
  }

  public enum ToolType {
    STARSHIP_REPAIR
  }
}
