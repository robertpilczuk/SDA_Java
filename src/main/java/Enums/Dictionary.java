package Enums;

public enum  Dictionary {
    LOGIN("Proszę zaloguj się"),
    LOGOUT("Wyloguj się");

    private String s;

    Dictionary(String name) {
        this.s = name;
    }

    @Override
    public String toString(){
        return s;
    }

}
