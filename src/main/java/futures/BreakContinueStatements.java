public class BreakContinueStatements {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
            System.out.println("BREAK ?");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            System.out.println("CONTINIUE ?");
        }


    }

}
