package task_5;

public class CheckPalindrome {
    public static boolean IsPalindrome(String sentence, int wordIndex) {
        String[] words = sentence.split(" ");
        String reverseWord = new StringBuilder(words[wordIndex]).reverse().toString();

        return words[wordIndex].equals(reverseWord);
    }
}
