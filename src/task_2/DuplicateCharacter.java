package task_2;

public class DuplicateCharacter {
    public static void Duplicate(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i));
        }
    }
}
