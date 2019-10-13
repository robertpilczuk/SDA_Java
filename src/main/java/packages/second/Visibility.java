package packages.second;

public class Visibility {
    First first;
    Second second;

    public void method(){
        first.packageScope =0;
        first.publicScope = 0;
        first.protectedScope = 0;
    }


}
