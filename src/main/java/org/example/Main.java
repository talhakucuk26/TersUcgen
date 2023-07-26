package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        int basamakSayi = input.nextInt();


        for (int i = basamakSayi; i >= 1; i--) {
            for (int j = 1; j <= (basamakSayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}