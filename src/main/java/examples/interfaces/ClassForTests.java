package examples.interfaces;

public class ClassForTests {

    private int state;
    private ClassImplementingInterface classImplementingInterface;
    private SecondClassWithoutInterface secondClassWithoutInterface;
    private OurFirstInterface ourFirstInterface;


    public ClassForTests(){
        classImplementingInterface = new ClassImplementingInterface();
        secondClassWithoutInterface = new SecondClassWithoutInterface();
        ourFirstInterface = new ClassImplementingInterface();
    }

    public ClassForTests(int state) {
        this.state = state;
    }

    public void testMethod(){
//        classImplementingInterface.add(1,1);
//        secondClassWithoutInterface.add(1,1);

        if (state>=0){
           int result =  classImplementingInterface.add(1,1);
            System.out.println("Jak dodam 1+1 to wychodzi mi "+ result);
        } else {
            secondClassWithoutInterface.add(1,1);
        }

    }

}
