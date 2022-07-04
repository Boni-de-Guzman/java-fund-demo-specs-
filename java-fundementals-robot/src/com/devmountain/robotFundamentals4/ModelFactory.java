package com.devmountain.robotFundamentals4;

import java.util.Map;

public class ModelFactory {

  public enum ModelType {
    ASTROMECH, PROTOCOL, BATTLE
  }

  public static Model getModel(ModelType modelName) {
    return modelMap.get(modelName);
  }

  private static Map<ModelType, Model> modelMap = Map.of(
      ModelFactory.ModelType.ASTROMECH, new Model("Astromech", "Starship Repair/Support"),
      ModelFactory.ModelType.PROTOCOL, new Model("Protocol", "Bounty Hunting"),
      ModelFactory.ModelType.BATTLE, new Model("Battle", "Battle")
  );

}