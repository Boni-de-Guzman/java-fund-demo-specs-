package com.devmountain.robotFundamentals1;

import java.util.Map;

public class ModelFactory {

  public enum ModelType {
    ASTROMECH, PROTOCOL, BATTLE
  }

  public static Model getModel(ModelType modelName) {
    return modelMap.get(modelName);
  }

  private static Map<ModelType, Model> modelMap = Map.of(
      ModelType.ASTROMECH, new Model("Astromech", "Starship Repair/Support"),
      ModelType.PROTOCOL, new Model("Protocol", "Bounty Hunting"),
      ModelType.BATTLE, new Model("Battle", "Battle")
  );



}
