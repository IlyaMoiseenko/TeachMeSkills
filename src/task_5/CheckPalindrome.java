package task_5;

public class CheckPalindrome {
    public static boolean IsPalindrome(String sentence, int wordIndex) {
        String[] words = sentence.split(" ");

        if (_checkWordIndex(wordIndex, words)) {
            String reverseWord = new StringBuilder(words[wordIndex]).reverse().toString();
            return words[wordIndex].equals(reverseWord);
        }

        return false;
    }

    private static boolean _checkWordIndex(int index, String[] words) {
        return index > words.length || index < words.length;
    }
}
