public class pay {
    public static void main(String[] args) {
        double pay = 600;
        int score = 99;

        if (score > 90) {

            pay = pay + (pay * 0.03);
        }

        System.out.println("The updated pay is: " + pay);
    }
}