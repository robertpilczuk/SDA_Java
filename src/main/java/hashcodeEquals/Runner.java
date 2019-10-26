package hashcodeEquals;

public class Runner {

    public static void main(String[] args) {
        MyObject myObject = new MyObject(1,"q");
        MyObject myObject1 = myObject;
        MyObject myObject2 = new MyObject(1,"q");
        MyObject myObject3 = new MyObject(212,"vadvdvds");

        System.out.println(myObject.hashCode());
        System.out.println(myObject1.hashCode());
        System.out.println(myObject2.hashCode());
        System.out.println(myObject3.hashCode());



    }
}
