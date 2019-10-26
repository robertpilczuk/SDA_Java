package tasks.date_20_10_2019.task1;

public class Menu {

    private Menu[] nextMenu;
    private String[] menuElements;
    private int optionSelected;

    public Menu(String menuElements) {
        this.menuElements = menuElements.split(";");
    }

    public Menu(Menu[] nextMenu, String menuElements) {
        this.nextMenu = nextMenu;
        this.menuElements = menuElements.split(";");
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public Menu getNextMenu() {
        if (nextMenu != null) {
            return nextMenu[optionSelected - 1];
        }
        return null;
    }

    public Menu print() {
        for (String m : menuElements) {
            System.out.println(m);
        }
        return this;
    }

    public void showPath() {
        if (menuElements != null || menuElements.length != 0) {
            System.out.print(menuElements[optionSelected - 1]);
            if (nextMenu != null) {
                if (nextMenu[optionSelected - 1] != null) {
                    System.out.print(" -> ");
                    nextMenu[optionSelected - 1].showPath();
                }
            }
        }
    }

}