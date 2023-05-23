import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(_timeOfTheYearSwitch());
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

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }
}