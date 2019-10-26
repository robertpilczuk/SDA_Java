package abstractClasses;

public class ClassExtendsAbstract extends AbstractClass{

    @Override
    public void setName(String name) {
        if (name!=null){
            this.name = name;
        }
    }
}
