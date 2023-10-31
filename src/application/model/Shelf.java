package application.model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Parts> parts;
    private StoreRoom storeRoom ;
    private Double shelfVolume ;

    public Shelf( StoreRoom storeRoom, Double shelfVolume) {
        this.parts = new ArrayList<>();
        this.storeRoom = storeRoom;
        this.shelfVolume = shelfVolume;
    }

    public List<Parts> getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts.add(parts);
    }

    public StoreRoom getStoreRoom() {
        return storeRoom;
    }

    public void setStoreRoom(StoreRoom storeRoom) {
        this.storeRoom = storeRoom;
    }

    public Double getShelfVolume() {
        return shelfVolume;
    }

    public void setShelfVolume(Double shelfVolume) {
        this.shelfVolume = shelfVolume;
    }
}
