package examples.hashCodeAndEquals;

public class HashCodeEquals {

    private static int counter = 0;

    private int internalCounter;

    public HashCodeEquals() {
        internalCounter = counter;
        counter++;
    }

    public int getCounter() {
        return this.internalCounter;
    }

    public void setCounter(int internalCounter) {
        this.internalCounter = internalCounter;
    }

    public int hashCode(){
        return internalCounter;
    }

    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o instanceof HashCodeEquals){
            if (((HashCodeEquals) o).internalCounter == this.internalCounter){
                return true;
            }
        }
        return false;
    }

}
