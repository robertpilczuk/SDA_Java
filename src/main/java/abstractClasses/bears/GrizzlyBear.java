package abstractClasses.bears;

public class GrizzlyBear extends Bear {


    @Override
    public void setFurCollor(String color) {
        if (color.toLowerCase().endsWith("brown")){
            this.furCollor = color;
        }

//        "Light brown"
//                "Dark Brown"
//                        "Unknown BrOwN"
    }

    @Override
    public void roar() {
        new GrizzlyBearRoar().roar();
    }
}
