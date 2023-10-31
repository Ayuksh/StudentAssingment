package application.service;

import application.repository.InventoryTest;

public interface Operations {
    public String getInventoryLocationByPartNumber(Integer partNumber);
    public Integer getNumberOfPartsGreaterThanAveragePartPrice();

}
