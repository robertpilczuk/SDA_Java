public class WhatIf {

    private String name;

    public void setName(String name) {
        if(this.name == null){
            this.name = name;//""
        }
    }

    public String getName() {
        if (name == null){
            return "";
        }else {
            return name;
        }

    }
}
