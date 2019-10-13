public class Methods {

    public static void main(String[] args) {
        int value1 = 234;
        int value2 = 10;

        int add = add(value1,value2);
        int sub = sub(value1,value2);
        int mul = mul(value1,value2);
        int div = div(value1,value2);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        int zero = giveZero();
        System.out.println(zero);
//        print(add);
//        print(sub);
//        print(div);



    }

    public static void print(int toPrint){
        System.out.println(toPrint);
        System.out.println(toPrint);
        System.out.println(toPrint);
        System.out.println(toPrint);
        System.out.println(toPrint);
    }


    public static int add(int a,int b){
        int c = a+b;
        return c;
    }

    public static int giveZero(){
        return 0;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static int div(int a,int b){
        return a/b;
    }

}
