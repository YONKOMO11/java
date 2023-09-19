import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance to drive (in miles): ");
        double distance = input.nextDouble();

        System.out.print("Enter the fuel efficiency of the car (miles per gallon): ");
        double fuelEfficiency = input.nextDouble();

        System.out.print("Enter the price per gallon of fuel (in dollars): ");
        double pricePerGallon = input.nextDouble();

        double costOfTrip = (distance / fuelEfficiency) * pricePerGallon;

        System.out.println("The cost of the trip is $" + costOfTrip);

        input.close();
    }
}