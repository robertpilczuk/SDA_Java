public class SwitchCase {

    public static void main(String[] args) {

        int statusCode = 404;

        switch (statusCode){
            case 200:
                System.out.println("HTTP OK");
                break;
            case 404:
                System.out.println("HTTP BAD REQUEST");
                break;
            case 500:
            case 501:
            case 503:
                System.out.println("Ups Server is down");
                break;
            default:
                System.out.println("Something is no yes.");

        }


        int number = 4;
        switch (number) {
            case  0:
                System.out.println("Why zero?");
                break;
            case 1:
                System.out.println("Ha Ha one.");
                break;
            case 2:
                System.out.println("Hey I have two");
                break;
            case 3:
                System.out.println("OMG three");
                break;


        }




    }



}
