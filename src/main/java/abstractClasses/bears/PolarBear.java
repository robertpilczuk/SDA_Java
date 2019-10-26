package abstractClasses.bears;

public class PolarBear extends Bear {

    private int dirtyLevel;

    public PolarBear(int dirtyLevel) {
        this.dirtyLevel = dirtyLevel;
    }



    @Override
    public void setFurCollor(String color) {
        switch (dirtyLevel){
            case 0:
                this.furCollor = "Snow White";
                break;
            case 1:
                this.furCollor = "50 shades of gray";
                break;
            default:
                this.furCollor = "Dirty as hell";
        }
    }

    @Override
    public void roar() {
        new PolarBearRoar().roar();
    }
}
