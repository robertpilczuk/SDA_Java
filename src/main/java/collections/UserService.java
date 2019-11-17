package collections;

public class UserService {

    private Account account;
    private String name;

    public UserService(String name) {
        this.name = name;
        account = new Account();
    }

    public void sayHello() {

        System.out.println("Siema " + name + ".");
    }

    public void roast(){
        System.out.println("You must get out of here.");
    }


    public double getAccount() {
        return account.getAccountValue();
    }
}
