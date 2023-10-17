import java.util.Scanner;

public class ex420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println(str + " has a length of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}