public class ClassConstrImpl {

    public static void main(String[] args){
        ClassConstruction aClass = new ClassConstruction();
        System.out.println(aClass.aInt);//100
        System.out.println(aClass.aBolean);//false
        System.out.println(aClass.aDouble);// 0.0
        System.out.println(aClass.secondString); // "SDA"

        ClassConstruction class2 = new ClassConstruction(true,
                'a',
                120,
                200L,
                2.2,
                2.2f,
                "Some String");
        System.out.println("second object");
        System.out.println(class2.aBolean);
        System.out.println(class2.aInt);
        System.out.println(class2.aLong);

        ClassConstruction class3 = new ClassConstruction(1,"",1L);

        ClassConstruction class4 = new ClassConstruction(1,1L);

        ClassConstruction class5 = new ClassConstruction(1L,1);
        ClassConstruction class6 = new ClassConstruction((byte)0);

        System.out.println(class5.aInt);

        class5.incrementInt();
        class5.incrementInt();
        class5.incrementInt();
        class5.incrementInt();
        class5.incrementInt();

        System.out.println(class5.aInt);

        System.out.println(class5.printPrimitives());
        System.out.println(class5);

    }



}
