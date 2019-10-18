public class For {

    public static void main(String[] args) {

        char[] chars = {'a','b','c','d','4'};

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

        for(int i = 0; i< chars.length;i++){
            System.out.println(chars[i]);
        }

        for(char c: chars){
            System.out.println(c);
        }

    }




}
