package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Enter first name");
        String firstName = scanner.nextLine().trim() + " ";

        System.out.println("Enter middle name or enter to skip");
        String middleName = scanner.nextLine().trim();

        if (!middleName.isEmpty()) {
            middleName = middleName + " ";
        }

        System.out.println("Enter last name");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter suffix or enter to skip");
        String suffix = scanner.nextLine().trim();

        if (!suffix.isEmpty()) {
            suffix = ", " + suffix;
        }

        String fullName = (firstName + middleName + lastName + suffix);

        System.out.printf("Full name: " + fullName);

        scanner.close();
    }
}
