package task_4;

public class FindDifferentCharactersIsMinimal {
    public static String Find(String sentence) {
        String[] words = sentence.split(" ");

        int maxCount = 0;
        int wordIndex = 0;

        for (int i = 0; i < words.length; i++) {
            int currentCount = 0;

            for (int j = 0; j < words[i].length(); j++) {
                for (int k = j; k < words[i].length(); k++) {
                    if (words[i].charAt(j) == words[i].charAt(k))
                        currentCount += 1;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                wordIndex = i;
            }
        }

        return words[wordIndex];
    }
}
