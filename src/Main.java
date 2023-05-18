import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        _getAndPrintData();
        _numericValueOfSymbol();
    }

    private static void _getAndPrintData() {
        Scanner scanner = _createScanner();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        int height = scanner.nextInt();

        System.out.print("Enter your weight: ");
        int weight = scanner.nextInt();

        System.out.println(
                "Name: " + name +
                "\nSurname: " + surName +
                "\nAge: " + age +
                "\nHeight: " + height +
                "\nWeight: " + weight);
    }

    private static void _numericValueOfSymbol() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the char: ");
        char value = scanner.next().charAt(0);

        System.out.println(value + ": " + (int)value);
    }

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }
}