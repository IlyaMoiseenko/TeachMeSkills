import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(_timeOfTheYearSwitch());
        System.out.println(_timeOfTheYearIfElse());
        System.out.println(_evenNumber());
        System.out.println(_checkTheTemperature());
        System.out.println(_checkRainbowColors());

        _printOddNumbers();
        _reversePrint();
    }

    private static String _timeOfTheYearSwitch() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the number of the month: ");
        int num = scanner.nextInt();

        return switch (num) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Please check input data";
        };
    }

    private static String _timeOfTheYearIfElse() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the number of the month: ");
        int num = scanner.nextInt();

        if (num >= 3 && num <= 5) {
            return "Spring";
        } else if (num >= 6 && num <= 8) {
            return "Summer";
        } else if (num >= 9 && num <= 11) {
            return "Autumn";
        } else {
            return "Winter";
        }
    }

    private static boolean _evenNumber() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        return num % 2 == 0;
    }

    private static String _checkTheTemperature() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > -5) return "Тепло";
        else if (temperature < -5 && temperature > -20) return "Нормально";
        else if (temperature < -20) return "Холодно";

        return "Please check input data";
    }

    private static String _checkRainbowColors() {
        Scanner scanner = _createScanner();

        System.out.print("Enter the color number: ");
        int colorNumber = scanner.nextInt();

        return switch (colorNumber) {
            case 1 -> "Red";
            case 2 -> "Orange";
            case 3 -> "Yellow";
            case 4 -> "Green";
            case 5 -> "Blue";
            case 6 -> "Indigo";
            case 7 -> "Violet";
            default -> "Please check input data";
        };
    }

    private static void _printOddNumbers() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }

    private static void _reversePrint() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}