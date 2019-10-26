package abstractClasses;

import abstractClasses.bears.GrizzlyBear;
import abstractClasses.bears.PolarBear;

public class Runner {
    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        };

        PolarBear polarBear = new PolarBear(2);
        GrizzlyBear grizzlyBear = new GrizzlyBear();

        polarBear.setFurCollor("brown");
        grizzlyBear.setFurCollor("Unknown BRoWN");

        System.out.println("Polar bear fur color: "+polarBear.getFurCollor());
        System.out.println("Grizzly bear fur color: "+grizzlyBear.getFurCollor());

        polarBear.roar();
        grizzlyBear.roar();

    }
}
