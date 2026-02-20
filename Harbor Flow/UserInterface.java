//User interface 
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ship details");
        String input = sc.nextLine();

        String[] parts = input.split(":");

        if (parts[0].equals("CargoShip")) {

            String shipId = parts[1];
            String shipName = parts[2];
            String country = parts[3];
            int capacity = Integer.parseInt(parts[4].trim());
            String containerType = parts[5];
            int noOfContainers = Integer.parseInt(parts[6].trim());

            CargoShip cargoShip = new CargoShip(
                    shipId, shipName, country, capacity,
                    containerType, noOfContainers
            );

            double cost = cargoShip.calculateCargoHandlingCost();

            if (cost == -1) {
                System.out.println("Invalid container type provided for Cargo Ship " + shipName);
            } else {
                System.out.println("Calculated Cargo Handling Cost for Ship "
                        + shipName + " is " + cost);
            }
        }

        else if (parts[0].equals("PassengerShip")) {

            String shipId = parts[1];
            String shipName = parts[2];
            String country = parts[3];
            int capacity = Integer.parseInt(parts[4].trim());
            String passengerType = parts[5];
            int noOfPassengers = Integer.parseInt(parts[6].trim());

            PassengerShip passengerShip = new PassengerShip(
                    shipId, shipName, country, capacity,
                    passengerType, noOfPassengers
            );

            double revenue = passengerShip.calculatePassengerRevenue();

            if (revenue == -1) {
                System.out.println("Invalid passenger type provided for Passenger Ship " + shipName);
            } else {
                System.out.println("Calculated Passenger Fare Collection for Ship "
                        + shipName + " is " + revenue);
            }
        }

        sc.close();
    }
}