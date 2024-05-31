package default_methods.application;

import default_methods.services.BrazilInterestService;
import default_methods.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(5.0);
        double payment = is.payment(amount, months);

        System.out.println("Pagamento depois de " + months + " meses:");
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}
