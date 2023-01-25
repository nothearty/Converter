package me.hearty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Da decimale a binario");
            System.out.println("2. Da binario a decimale");
            System.out.print("Inserisci la tua scelta: ");
            choice = input.nextInt();
        } while(choice != 1 && choice != 2);

        System.out.print("Inserisci un numero: ");
        int num = input.nextInt();
        if (choice == 1) {
            System.out.println("Il numero in binario è: " + decToBin(num));
        } else if (choice == 2) {
            System.out.println("Il numero in decimale è: " + binToDec(num + ""));
        } else {
            System.out.println("Scelta non valida");
        }

    }

    public static String decToBin(int num) {
        String bin;
        for(bin = ""; num > 0; num /= 2) {
            bin = num % 2 + bin;
        }

        return bin;
    }

    public static int binToDec(String bin) {
        int dec = 0;

        for(int i = 0; i < bin.length(); ++i) {
            if (bin.charAt(i) == '1') {
                dec = (int)((double)dec + Math.pow(2.0, (double)(bin.length() - i - 1)));
            }
        }

        return dec;
    }
}
