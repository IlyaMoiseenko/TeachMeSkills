import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        _getAndPrintData();
        System.out.println("---------");

        _numericValueOfSymbol();
        System.out.println("---------");

        _bodyMassIndex();
        System.out.println("---------");
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
        double height = scanner.nextDouble();

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

    private static void _bodyMassIndex() {
        Scanner scanner = _createScanner();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("BodyMassIndex: " + weight / Math.pow(height / 100, 2));
    }

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }
}