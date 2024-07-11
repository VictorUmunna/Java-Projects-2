import java.util.*;

public class TextAnalysisTool {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // User Input
            System.out.println("Enter a paragraph:");
            String text = scanner.nextLine().trim();

            // Character Count
            int charCount = text.length();
            System.out.println("Character Count: " + charCount);

            // Word Count
            String[] words = text.split("\\s+");
            int wordCount = words.length;
            System.out.println("Word Count: " + wordCount);

            // Most Common Character
            char mostCommonChar = findMostCommonChar(text);
            System.out.println("Most Common Character: " + mostCommonChar);

            // Character Frequency
            System.out.println("Enter a character to find its frequency:");
            String charInput = scanner.nextLine().trim();
            if (charInput.length() != 1) {
                System.out.println("Please enter a single character.");
            } else {
                char c = charInput.charAt(0);
                int charFrequency = countCharFrequency(text, c);
                System.out.println("Frequency of '" + c + "': " + charFrequency);
            }

            // Word Frequency
            System.out.println("Enter a word to find its frequency:");
            String word = scanner.nextLine().trim();
            int wordFrequency = countWordFrequency(text, word);
            System.out.println("Frequency of '" + word + "': " + wordFrequency);

            // Unique Words
            int uniqueWords = countUniqueWords(words);
            System.out.println("Number of Unique Words: " + uniqueWords);
        }
    }

    // Find the most common character in the text
    private static char findMostCommonChar(String text) {
        int[] charCounts = new int[256];
        for (char c : text.toCharArray()) {
            charCounts[c]++;
        }
        int maxCount = -1;
        List<Character> mostCommonChars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostCommonChars.clear();
                mostCommonChars.add((char) i);
            } else if (charCounts[i] == maxCount) {
                mostCommonChars.add((char) i);
            }
        }
        return mostCommonChars.get(new Random().nextInt(mostCommonChars.size()));
    }

    // Count frequency of a specific character in the text (case-insensitive)
    private static int countCharFrequency(String text, char c) {
        int count = 0;
        for (char character : text.toCharArray()) {
            if (Character.toLowerCase(character) == Character.toLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    // Count frequency of a specific word in the text (case-insensitive)
    private static int countWordFrequency(String text, String word) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    // Count the number of unique words in the text (case-insensitive)
    private static int countUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords.size();
    }
}
