package task_3;

public class FindMaxMinLengthWord {
    public static void Find(String sentence) {
        String[] words = sentence.split(" ");
        String maxLength = words[0];
        String minLength = words[0];

        for (String word : words) {
            if (word.length() > maxLength.length())
                maxLength = word;
            else if (word.length() < minLength.length())
                minLength = word;

        }

        System.out.println("Max: " + maxLength + "\nMin: " + minLength);
    }
}
