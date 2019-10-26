package Enums;

public class Runner {
    public static void main(String[] args) {
//        System.out.println(DaysVar.PONIEDZIAŁEK);
//        System.out.println(Days.values()[0]);
//        System.out.println(LOGOUT);

        String month = "maRZec";

        System.out.println(Months.valueOf(month.toUpperCase())
                .ordinal());

        Months readed = Months.valueOf(month.toUpperCase());

        switch (readed){
            case LUTY:
                System.out.println("Zimno");
                break;
            case STYCZEŃ:
                System.out.println("Czemu musi być zima !");
                break;
            default:
                System.out.println("U nas 11 miesięcy zima a później już lato i lato");
        }

    }
}
