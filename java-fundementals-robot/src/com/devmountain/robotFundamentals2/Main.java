package com.devmountain.robotFundamentals2;

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
        Droid r2d2 = new Droid("R2D2", model, tools);
        System.out.println(r2d2);
        r2d2.speak();

        for (int i = 0; i < 11; i++) {
            r2d2.repairStarship();
        }

    }
}
