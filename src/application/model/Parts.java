package application.model;

public class Parts {
    private Integer partNumber ;
    private Double partCost ;

    public Parts( Integer partNumber , Double partCost) {
        this.partNumber = partNumber ;
        this.partCost = partCost;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    public Double getPartCost() {
        return partCost;
    }

    public void setPartCost(Double partCost) {
        this.partCost = partCost;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "partNumber=" + partNumber +
                ", partCost=" + partCost +
                '}';
    }
}
