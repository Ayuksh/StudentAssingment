package application.model;

import java.util.ArrayList;
import java.util.List;

public class StoreRoom {
    private static Integer id = 0 ;
    private Integer storeRoomId ;
    private Double storeRoomArea ;
    private List<Shelf> shelves ;

    public StoreRoom(Double storeRoomArea) {
        id += 1;
        this.storeRoomId =id ;
        this.storeRoomArea = storeRoomArea;
        this.shelves = new ArrayList<>();
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        StoreRoom.id = id;
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
}
