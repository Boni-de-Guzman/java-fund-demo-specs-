package com.devmountain.robotFundamentals1;

public class Main {

    public static void main(String[] args) {

        //Lets build R2D2
        Model model = ModelFactory.getModel(ModelFactory.ModelType.ASTROMECH);
        Droid r2d2 = new Droid("R2D2", model);

        System.out.println(r2d2);
        r2d2.speak();
    }
}
