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
    String aString;

    //no argument constructor - kontruktor bezargumentowy umożliwiający stworzenie obiektu
    public ClassConstruction() {
    }

    //all arguments constructor - konstruktor umożliwiający stworzenie obiektu i ustawiający wszystkie pola w obiekcie
    public ClassConstruction(boolean aBolean, short aShort, byte aByte, char aChar, int aInt, long aLong, double aDouble, float aFloat, String aString) {
        this.aBolean = aBolean;
        this.aShort = aShort;
        this.aByte = aByte;
        this.aChar = aChar;
        this.aInt = aInt;
        this.aLong = aLong;
        this.aDouble = aDouble;
        this.aFloat = aFloat;
        this.aString = aString;
    }



}
