package application.repository;

import application.model.Parts;
import application.model.Shelf;
import application.model.StoreRoom;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest {

    private static final List<StoreRoom> inventory = new ArrayList<>();
    static {
        StoreRoom storeRoom1 = new StoreRoom(100.00);
        Shelf shelf1 = new Shelf(storeRoom1 , 200.00);
        shelf1.setParts(new Parts(10.50));
        shelf1.setParts(new Parts(12.50));
        Shelf shelf2 = new Shelf(storeRoom1 , 200.00);
        shelf2.setParts(new Parts(11.50));
        shelf2.setParts(new Parts(13.50));
        shelf2.setParts(new Parts(21.50));
        shelf2.setParts(new Parts(9.50));
        storeRoom1.setShelves(shelf1);
        storeRoom1.setShelves(shelf2);
    }

    public static List<StoreRoom> getInventory() {
        return inventory;
    }

//    public static void setInventory(List<StoreRoom> inventory) {
//        InventoryTest.inventory = inventory;
//    }
}
