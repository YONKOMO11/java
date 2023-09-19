import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (-58°F to 41°F): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (equal or greater than 2 mph): ");
        double windSpeed = input.nextDouble();

        if (temperature >= -58 && temperature <= 41 && windSpeed >= 2) {

            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                    + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

            System.out.println("The wind-chill temperature is " + windChill + "°F");
        } else {
            System.out.println(
                    "Invalid input. Temperature must be between -58°F and 41°F, and wind speed must be equal or greater than 2 mph.");
        }

        input.close();
    }
}