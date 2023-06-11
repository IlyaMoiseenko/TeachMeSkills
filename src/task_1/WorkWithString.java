package task_1;

public class WorkWithString {
    /*
    Вывести на экран в одну строку два первых блока по 4 цифры.
    */
    public static void PrintFirstTwoBlocksOfFourDigits(String number) {
        int digitsCount = 0;

        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                System.out.print(number.charAt(i));
                digitsCount += 1;
            }

            if (digitsCount == 8)
                break;
        }
    }

    /*
    Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    */
    public static void ChangeBlocksOfThreeLetters(String number) {
        int countLetter = 0;

        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i)) && number.charAt(i) != '-')
                countLetter += 1;
            else if (countLetter == 3) {
                number = number.replace(
                        number.substring(i - countLetter, i),
                        "***"
                );

                countLetter = 0;
            }
        }

        System.out.println(number);
    }

    /*
    Вывести на экран только одни буквы из номера документа
    в формате yyy/yyy/y/y в нижнем регистре.
    */
    public static void PrintOnlyLetter(String number) {
        number = number
                .toLowerCase()
                .replace('-', '0');

        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i)))
                System.out.print(number.charAt(i));
            else {
                if (i - 1 < 0)
                    continue;

                if (Character.isLetter(number.charAt(i - 1)))
                    System.out.print('/');
            }
        }
    }

    /*
    Вывести на экран буквы из номера документа в формате
    "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    класса StringBuilder).
*/
    public static void PrintOnlyLetterStringBuilder(StringBuilder number) {
        System.out.print("Letters: ");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-') {
                number = number.replace(i, i + 1, "0");
            }

            if (!Character.isDigit(number.charAt(i)))
                System.out.print(number.charAt(i));
            else {
                if (i - 1 < 0)
                    continue;

                if (Character.isLetter(number.charAt(i - 1)))
                    System.out.print('/');
            }
        }
    }

    /*
    Проверить содержит ли номер документа последовательность abc и
    вывети сообщение содержит или нет(причем, abc и ABC считается
    одинаковой последовательностью).
    */
    public static boolean ContainsSubString(String number, String subString) {
        return number
                .toLowerCase()
                .contains(subString.toLowerCase());
    }

    /*
    Проверить начинается ли номер документа с последовательности 555
    */
    public static boolean StartWith(String number, String prefix) {
        return number.startsWith(prefix);
    }

    /*
    Проверить заканчивается ли номер документа на последовательность 1a2b
    */
    public static boolean EndWith(String number, String prefix) {
        return number.endsWith(prefix);
    }
}
