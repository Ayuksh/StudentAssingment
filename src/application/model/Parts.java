package application.model;

public class Parts {
    private static Integer id = 0  ;
    private Integer partNumber ;
    private Double partCost ;

    public Parts( Double partCost) {
        id += 1;
        this.partNumber = id;
        this.partCost = partCost;
    }
}
