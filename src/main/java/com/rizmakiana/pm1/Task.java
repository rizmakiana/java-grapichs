package com.rizmakiana.pm1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama anda : ");
        String name = scanner.nextLine();

        System.out.print("Masukan NPM anda  : ");
        String id = scanner.next();

        System.out.printf("\nHalo %s. NPM anda adalah %s", name, id);
        scanner.close();
    }
    
}
