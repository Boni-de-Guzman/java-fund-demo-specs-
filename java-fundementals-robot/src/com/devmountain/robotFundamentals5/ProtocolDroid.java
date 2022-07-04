package com.devmountain.robotFundamentals5;

import java.util.List;

public class ProtocolDroid extends Droid {
  public ProtocolDroid(String serialNumber, Model model, List<Tool> tools) {
    super(serialNumber, model, tools);
  }

  @Override
  protected void speak(){
    System.out.println("Why I never!");
  }
}
