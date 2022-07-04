package com.devmountain.robotFundamentals4;

import com.devmountain.robotFundamentals5.Defender;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Lets build R2D2
        Model model = ModelFactory.getModel(ModelFactory.ModelType.ASTROMECH);
        List<Tool> tools = new ArrayList<>();
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        AstromechDroid r2d2 = new AstromechDroid("R2D2", model, tools);
        System.out.println(r2d2);

        List<Droid> droids = new ArrayList<>();
        List<Tool> rifles = new ArrayList<>();
        rifles.add(new Tool(Tool.ToolType.RIFLE));
        BattleDroid oom9 = new BattleDroid("00M-9", ModelFactory.getModel(ModelFactory.ModelType.BATTLE), rifles);
        ProtocolDroid c3po = new ProtocolDroid("c3p0", ModelFactory.getModel(ModelFactory.ModelType.PROTOCOL), new ArrayList<>());
        droids.add(r2d2);
        droids.add(oom9);
        droids.add(c3po);

        for(Droid droid : droids) {
            droid.speak();
        }

        for (int i = 0; i < 11; i++) {
            r2d2.repairStarship();
        }

        for (int i = 0; i < 6; i++) {
            oom9.shootEnemy();
        }

        BattleDroid oom7 = new BattleDroid("OOM-7", ModelFactory.getModel(ModelFactory.ModelType.BATTLE), rifles);
        AstromechDroid r2d5 = new AstromechDroid("R2D5", model, tools);
        List<Defender> defenders = new ArrayList<>();
        defenders.add(oom7);
        defenders.add(r2d5);

        for(Defender defender : defenders) {
            defender.defend();
        }
    }
}
