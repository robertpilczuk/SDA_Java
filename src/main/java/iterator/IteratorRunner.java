package iterator;

public class IteratorRunner {

    public static void main(String[] args) {
        int[] table = {1,2,4,5,6,78,8,9,4};
        for (int i = 0; i < 10; i++) {
            System.out.println(table[i]);
        }

        for (int e: table){
            System.out.println(e);
        }


        System.out.println("====================");

        Iter iter = new Iter(new int[]{1,2,3,3,2,32,3});

        while (iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
