import java.util.ArrayList;
import java.util.Iterator;

import javafx.scene.control.MenuItem;

public class PancakeHouseMenu {
    ArrayList<menuItem> menuItems;

    // constructor
    // addItem
    public Iterator createIterator() {
        return new PancakeMenuIterator(menuItems);
    }

}
