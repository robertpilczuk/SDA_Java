public class MethodsOverload {


    public static void main(String[] args) {
        int value1 = 234;
        int value2 = 10;
        int value3 = 11;
        int value4 = 14;
        int value5 = 17;

        int add2 = add(value1,value2);
        int add3 = add(value1,value2,value3);
        int add4 = add(value1,value2,value3,value4);
        int add5 = add(value1,value2,value3,value4,value5);

        int sum = add(value1,value2);
        int sum2 = add(value3,sum);

        System.out.println(add2);
        System.out.println(add3);
        System.out.println(add4);
        System.out.println(add5);

        System.out.println(returnValue(1L));
//        System.out.println(returnValue("SDA"));
//        System.out.println(returnValue(11111L));
//        System.out.println(returnValue(1,"SDA"));


    }


    public static String returnValue(int value){
        return "int value: "+value;
    }

    public static String returnValue(long value){
        return "long value: "+value;
    }

    public static String returnValue(String name){
        return "string value: "+name;
    }

    public static String returnValue(int myInt,String name){
        return "";
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static int add(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }

}
