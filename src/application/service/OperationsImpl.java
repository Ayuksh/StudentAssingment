package application.service;

import application.model.Parts;
import application.model.Shelf;
import application.model.StoreRoom;
import application.repository.InventoryTest;

import java.util.List;
import java.util.Objects;

public class OperationsImpl implements Operations{
    @Override
    public String getInventoryLocationByPartNumber(Integer partNumber) {
        List<StoreRoom> storeRoomList  =InventoryTest.getInventory();
        for (StoreRoom storeRoom : storeRoomList){
            for (Shelf shelf : storeRoom.getShelves())
                for (Parts parts : shelf.getParts())
                    if(Objects.equals(parts.getPartNumber(), partNumber))
                        return "Store Room id: "+storeRoom.getStoreRoomId()+", Shelf id: "+shelf.getShelfId();

        }
        return "Part not found !!";
    }

    @Override
    public Integer getNumberOfPartsGreaterThanAveragePartPrice() {
        Integer totalParts =0 ;
        Double avgPrice = findAveragePrice();
        List<StoreRoom> storeRoomList = InventoryTest.getInventory();
        for (StoreRoom storeRoom : storeRoomList)
            for (Shelf shelf : storeRoom.getShelves())
                for (Parts parts : shelf.getParts())
                    if (parts.getPartCost() >= avgPrice )
                        totalParts++;


        return totalParts ;
    }

    private Double findAveragePrice() {
        Double totalPrice = 0.0 ; Integer totalParts =0 ;
        List<StoreRoom> storeRoomList = InventoryTest.getInventory();
        for (StoreRoom storeRoom : storeRoomList)
            for (Shelf shelf : storeRoom.getShelves())
                for (Parts parts : shelf.getParts()) {
                    totalPrice += parts.getPartCost();
                    totalParts++;
                }
        return totalPrice/totalParts ;
    }

}
