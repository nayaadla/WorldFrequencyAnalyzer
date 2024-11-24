
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine();

        // Process the text to count word frequencies
        Map<String, Integer> wordFrequencies = analyzeWordFrequency(inputText);

        // Display the word frequencies
        displayWordFrequencies(wordFrequencies);

        // Close the scanner
        scanner.close();
    }

    /**
     * Analyzes the frequency of words in a given text.
     * @param text The input text to analyze.
     * @return A map of words to their frequencies.
     */
    private static Map<String, Integer> analyzeWordFrequency(String text) {
        // Create a map to store word frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Remove punctuation and convert text to lowercase for uniformity
        text = text.replaceAll("[^a-zA-Z0-9\s]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split("\s+");

        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }

    /**
     * Displays the word frequencies in a formatted manner.
     * @param wordFrequencies A map of words to their frequencies.
     */
    private static void displayWordFrequencies(Map<String, Integer> wordFrequencies) {
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
