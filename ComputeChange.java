import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (last two digits represent cents): ");
        int cents = input.nextInt();

        int dollars = cents / 100;
        int remainingCents = cents % 100;

        System.out.println("Dollars: " + dollars);
        System.out.println("Cents: " + remainingCents);

        input.close();
    }
}
