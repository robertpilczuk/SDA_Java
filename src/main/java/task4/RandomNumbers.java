package task4;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] myInts = {28,655898,89478,248,6877,12587,565};

        NumberSercher numberSercher = new NumberSercher(myInts);
        System.out.println(numberSercher.minMax()[0]);
        System.out.println(numberSercher.minMax()[1]);

    }

}
