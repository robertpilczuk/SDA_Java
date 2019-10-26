package examples.enums;

public class Runner {

    public static void main(String[] args) {

        MyFirstEnum.TDD.getValue();
        MyFirstEnum.DDD.getValue();


        System.out.println(Dni.PONIEDZIAŁEK);
        System.out.println(Dni.PONIEDZIAŁEK.ordinal());
        System.out.println(Dni.values()[0]);

    }


}
