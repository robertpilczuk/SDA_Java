public class SuperHiperExtraCircleCalculator {

    public static void main(String[] args) {

        System.out.println("Area from 1: "+area(1));
        System.out.println("Area from -1: "+area(-1));

    }

    public static double area(double radius){
        if (radius > 0){
            return Math.PI *radius *radius;
        }
        return 0;
    }

    public static double areaWithFuse(double radius){
        double fuse= 0.0;
        if (radius > 0){
            fuse = Math.PI *radius *radius;
        }
        return fuse;
    }


}
