package generics.intro.app;

import generics.intro.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Quantos valores? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            ps.addValue(sc.nextInt());

        }

        ps.print();
        System.out.println();
        Integer v = ps.first();
        System.out.println("Primeiro: " + v);

        sc.close();

    }
}
