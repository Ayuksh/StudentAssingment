package application.service;

import application.model.Parts;
import application.model.Shelf;
import application.model.StoreRoom;
import application.repository.InventoryTest;

import java.util.List;

public class OperationsImpl implements Operations{
    @Override
    public String getInventoryLocationByPartNumber(Integer partNumber) {
        List<StoreRoom> storeRoomList  =InventoryTest.getInventory();
        for (StoreRoom sr : storeRoomList){
            for (Shelf shelf : sr.getShelves())
                for (Parts parts : shelf.getParts())

        }
    }

    @Override
    public Integer getNumberOfPartsGreaterThanAveragePartPrice() {
        return null;
    }
}
