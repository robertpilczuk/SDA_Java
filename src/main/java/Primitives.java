public class Primitives {

    public static void main(String[] args) {

        //primitives
        boolean aBolean = true;
        short aShort = 0;
        byte aByte = 0;
        char aChar = 48;
        int aInt = 0;
        long aLong = 0L;
        double aDouble = 0.0;
        float aFloat = 0.0f;

        char[] charTableExplicit = {1,2,3};
        char[] charTable = new char[3];
        boolean[] booleanTable = new boolean[3];
        System.out.println(booleanTable[0]);
        System.out.println(booleanTable[1]);
        System.out.println(booleanTable[2]);
      //boolean[] booleanTable = {false,false,false};

//      char[] charTable = {0,0,0}; to samo co powyżej tylko zadeklarowane w sposób jawny
        String[] stringTable = {null,null,null};
        String[] stringTable2 = new String[3];
        System.out.println("ST: "+stringTable[1]);
        stringTable2[0] = ""; // {"",null,null};
        stringTable2[2] = "SDA"; // {"",null,"SDA"};


        charTable[0] = 48;
        charTable[1] = 49;
        charTable[2] = 50;


        System.out.println(aBolean);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aChar);
        System.out.println(aInt);
        System.out.println(aLong);
        System.out.println(aDouble);
        System.out.println(aFloat);
        System.out.println(charTableExplicit);
        System.out.println(charTable);

    }
}
