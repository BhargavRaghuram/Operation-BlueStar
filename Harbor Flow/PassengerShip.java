//PassengerShip Class

public class PassengerShip extends Ship {

    private String passengerType;
    private int noOfPassengers;

    public PassengerShip(String shipId, String shipName, String country, int capacity,
                         String passengerType, int noOfPassengers) {
        super(shipId, shipName, country, capacity);
        this.passengerType = passengerType;
        this.noOfPassengers = noOfPassengers;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public double calculatePassengerRevenue() {

        double farePerPassenger;

        if (passengerType.equals("Economy")) {
            farePerPassenger = 5000;
        }
        else if (passengerType.equals("Business")) {
            farePerPassenger = 12000;
        }
        else if (passengerType.equals("Luxury")) {
            farePerPassenger = 25000;
        }
        else {
            return -1;
        }

        double totalRevenue = farePerPassenger * noOfPassengers;

        // 12% luxury tax if Luxury and passengers > 200
        if (passengerType.equals("Luxury") && noOfPassengers > 200) {
            totalRevenue = totalRevenue + (totalRevenue * 0.12);
        }

        return totalRevenue;
    }
}