package converters.temperatue;

public class CelsiucConverter {

   private double degres;

    public CelsiucConverter(double degres) {
        this.degres = degres;
    }

    public double toKelvin(){
        return degres - 273.15;
    }

    public double toFarenhiet(){
        return (degres-32) *9/5;
    }

    public double toRankin(){
        return degres * 1.8 + 273.15;
    }


}
