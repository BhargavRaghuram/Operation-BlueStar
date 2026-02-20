import java.util.Scanner;

public class UserInterface {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the ship details");
        String input = sc.nextLine();
 
        String[] data = input.split(":");
 
        if (data[0].equals("CargoShip")) {
 
            CargoShip cargoShip = new CargoShip(
                    data[1],
                    data[2],
                    data[3],
                    Integer.parseInt(data[4]),
                    data[5],
                    Integer.parseInt(data[6])
            );
 
            double result = cargoShip.calculateCargoHandlingCost();
 
            if (result == -1) {
                System.out.println("Invalid container type provided for Cargo Ship "
                                    + cargoShip.getShipName());
            } else {
                System.out.println("Calculated Cargo Handling Cost for Ship "
                        + cargoShip.getShipName() + " is " + result);
            }
 
        } else if (data[0].equals("PassengerShip")) {
 
            PassengerShip passengerShip = new PassengerShip(
                    data[1],
                    data[2],
                    data[3],
                    Integer.parseInt(data[4]),
                    data[5],
                    Integer.parseInt(data[6])
            );
 
            double result = passengerShip.calculatePassengerRevenue();
 
            if (result == -1) {
                System.out.println("Invalid passenger type provided for Passenger Ship "
                                    + passengerShip.getShipName());
            } else {
                System.out.println("Calculated Passenger Fare Collection for Ship "
                        + passengerShip.getShipName() + " is " + result);
            }
        }
 
        sc.close();
    }
}