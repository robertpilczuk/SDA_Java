package examples.innerClass;

public class OutsideClass {

private InnerClass innerClass;
private int value = 10;

public int returnValue(){
    return value +5;
}


private class InnerClass{


}

public class PublicInnerClass{

    public int returnValue(){
        return value +10;
    }

}

}
