import java.util.Iterator;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu2,DinerMenu dinerMenu2) {
        this.pancakeHouseMenu = pancakeHouseMenu2;
        this.dinerMenu = dinerMenu2;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    // other methods:
    // public void printVegetarianMenu();
    // public boolean isItemVegetarian(String name);

    public void printVegetarianMenu() {
    }

}
