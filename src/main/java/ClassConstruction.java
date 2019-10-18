public class ClassConstruction {

    //fields - pola czyli co bedzie przechowywał nasz obiekt i na czym będzie pracował
    boolean aBolean;
    short aShort;
    byte aByte;
    char aChar;
    int aInt;
    long aLong;
    double aDouble;
    float aFloat;
    String aString = new String("ADS");
    String secondString;

    //no argument constructor - kontruktor bezargumentowy umożliwiający stworzenie obiektu
    public ClassConstruction() {
        aBolean = false;
        aShort = 0;
        aInt = 100;
        secondString = "SDA";
        aString = new String("ADS");
    }

    public ClassConstruction(boolean aBoolean){
        this.aBolean = aBoolean;
    }

    public ClassConstruction(int aInt,String parametrString){
        this.aInt = aInt;
        this.aString = parametrString;
    }

    public ClassConstruction(int aInt){
        this.aInt = aInt;
    }
    public ClassConstruction(int aInt,long longer){
        this.aInt = aInt;
        this.aLong = longer;
    }
    public ClassConstruction(long longer,int aInt){
        this.aInt = aInt;
        this.aLong = longer;
    }

    public ClassConstruction(int myInt,String myString,long myLong){

    }



    //all arguments constructor - konstruktor umożliwiający stworzenie obiektu i ustawiający wszystkie pola w obiekcie
    public ClassConstruction(boolean aBolean,
                             char aChar,
                             int aInt,
                             long aLong,
                             double aDouble,
                             float aFloat,
                             String aString) {
        this.aBolean = aBolean;
        this.aChar = aChar;
        this.aInt = aInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.aFloat = aFloat;
        this.aString = aString;
    }

    public ClassConstruction(byte myByte){
        this.aByte = myByte;
    }

    public void incrementInt(){
        this.aInt++;
    }

    public String printPrimitives(){
        return "aBolean: "+aBolean+
        " aShort: "+aShort+
        " aByte: "+aByte+
        " aChar: "+aChar+
        " aInt: "+aInt+
        " aLong: "+aLong+
        " aDouble: "+aDouble+
        " aFloat: "+aFloat;
    }


    @Override
    public String toString(){
        return "aBolean: "+aBolean+
                " aShort: "+aShort+
                " aByte: "+aByte+
                " aChar: "+aChar+
                " aInt: "+aInt+
                " aLong: "+aLong+
                " aDouble: "+aDouble+
                " aFloat: "+aFloat;
    }

}
