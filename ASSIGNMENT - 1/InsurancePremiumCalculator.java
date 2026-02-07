import java.util.Scanner;

public class InsurancePremiumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String buildingType = sc.nextLine();
        double amountInsured = sc.nextDouble();
        int claims = sc.nextInt();

        double rate;
        double processingCharge;
        double discount = 0;

        if (buildingType.equals("Domestic")) {

            if (amountInsured < 100000) {
                rate = 0.003;
            } else {
                rate = 0.0025;
            }

            processingCharge = 50;

            if (claims == 0) {
                discount = 0.10;
            }

        } else {   // Commercial

            if (amountInsured < 250000) {
                rate = 0.005;
            } else {
                rate = 0.0075;
            }

            processingCharge = 80;

            if (claims == 0) {
                discount = 0.15;
            }
        }

        double premium = (amountInsured * rate) + processingCharge;
        double finalPremium = premium - (premium * discount);

        System.out.printf("%.2f"+"\n", finalPremium);

        sc.close();
    }
}
