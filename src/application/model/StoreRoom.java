package application.model;

import java.util.ArrayList;
import java.util.List;

public class StoreRoom {
    private Integer storeRoomId ;
    private Double storeRoomArea ;
    private List<Shelf> shelves ;

    public StoreRoom(Integer storeRoomId , Double storeRoomArea) {
        this.storeRoomId =storeRoomId ;
        this.storeRoomArea = storeRoomArea;
        this.shelves = new ArrayList<>();
    }

    public Integer getStoreRoomId() {
        return storeRoomId;
    }

    public void setStoreRoomId(Integer storeRoomId) {
        this.storeRoomId = storeRoomId;
    }

    public Double getStoreRoomArea() {
        return storeRoomArea;
    }

    public void setStoreRoomArea(Double storeRoomArea) {
        this.storeRoomArea = storeRoomArea;
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    public void setShelves(Shelf shelve) {
        shelves.add(shelve);
    }

    @Override
    public String toString() {
        return "StoreRoom{" +
                "storeRoomId=" + storeRoomId +
                ", storeRoomArea=" + storeRoomArea +
                ", shelves=" + shelves +
                '}';
    }
}
