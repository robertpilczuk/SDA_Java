package hashcodeEquals;

import java.util.Objects;

public class MyObject {
    private int value;
    private String name;

    public MyObject(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int charsSum = 0;
        if(name!=null){
          for (char c: name.toCharArray()){
              charsSum+=c;
          }
        }
        return value+charsSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return value == myObject.value &&
                Objects.equals(name, myObject.name);
    }
}
