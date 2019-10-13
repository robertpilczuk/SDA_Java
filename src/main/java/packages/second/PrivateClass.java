package packages.second;

public class PrivateClass{

    private PrivateInnerClass privateInnerClass;
    protected int protectedScope;



private class PrivateInnerClass{
    PrivateClass privateClass;

    public void method(){

    }
}

}