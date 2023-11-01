package application.repository;

import application.model.Parts;
import application.model.Shelf;
import application.model.StoreRoom;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest {

    private static final List<StoreRoom> inventory = new ArrayList<>();
    static {
        StoreRoom storeRoom1 = new StoreRoom(1 , 100.00);
        Shelf shelf1 = new Shelf(1 , storeRoom1 , 200.00);
        shelf1.setParts(new Parts(1 , 10.50));
        shelf1.setParts(new Parts(2 , 12.50));
        Shelf shelf2 = new Shelf(2 , storeRoom1 , 200.00);
        shelf2.setParts(new Parts(3 , 11.50));
        shelf2.setParts(new Parts(4 , 13.50));
        shelf2.setParts(new Parts(5 , 21.50));
        shelf2.setParts(new Parts(6 , 9.50));
        storeRoom1.setShelves(shelf1);
        storeRoom1.setShelves(shelf2);
        inventory.add(storeRoom1);
    }

    static {
        StoreRoom storeRoom2 = new StoreRoom(2 , 150.00);
        Shelf shelf1 = new Shelf(1 , storeRoom2 , 200.00);
        shelf1.setParts(new Parts(7 , 11.53));
        shelf1.setParts(new Parts(8 , 14.56));
        Shelf shelf2 = new Shelf(2 , storeRoom2 , 200.00);
        shelf2.setParts(new Parts(9 , 12.50));
        shelf2.setParts(new Parts(10 , 19.57));
        shelf2.setParts(new Parts(11 , 23.54));
        shelf2.setParts(new Parts(12 , 7.90));
        storeRoom2.setShelves(shelf1);
        storeRoom2.setShelves(shelf2);
        inventory.add(storeRoom2);
    }

    public static List<StoreRoom> getInventory() {
        return inventory;
    }

//    public static void setInventory(List<StoreRoom> inventory) {
//        InventoryTest.inventory = inventory;
//    }

}
