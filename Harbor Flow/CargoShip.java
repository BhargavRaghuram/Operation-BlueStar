//CargoShip Class

public class CargoShip extends Ship {

    private String containerType;
    private int noOfContainers;

    public CargoShip(String shipId, String shipName, String country, int capacity,
                     String containerType, int noOfContainers) {
        super(shipId, shipName, country, capacity);
        this.containerType = containerType;
        this.noOfContainers = noOfContainers;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public int getNoOfContainers() {
        return noOfContainers;
    }

    public void setNoOfContainers(int noOfContainers) {
        this.noOfContainers = noOfContainers;
    }

    public double calculateCargoHandlingCost() {

        double costPerContainer;

        if (containerType.equals("Standard")) {
            costPerContainer = 2000;
        }
        else if (containerType.equals("Refrigerated")) {
            costPerContainer = 3500;
        }
        else if (containerType.equals("Hazardous")) {
            costPerContainer = 6000;
        }
        else {
            return -1;
        }

        double totalCost = costPerContainer * noOfContainers;

        // 10% surcharge if Hazardous and containers > 100
        if (containerType.equals("Hazardous") && noOfContainers > 100) {
            totalCost = totalCost + (totalCost * 0.10);
        }

        return totalCost;
    }
}