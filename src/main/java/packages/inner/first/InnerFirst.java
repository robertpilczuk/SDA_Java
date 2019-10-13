package packages.inner.first;

import packages.second.First;

public class InnerFirst {
    int packageScope;
    public int publicScope;
    private int privateScope;
    protected int protectedScope;
    private First first;

    public void method(){
        first.publicScope = 0;
    }
}
