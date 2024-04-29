package midterm.lizi_lobzhanidze_3.task4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Extract unique words
        Set<String> uniqueWords = new TreeSet<>(fantasyFormatData);

        // Create a map to count word occurrences by length
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        // Print unique words to console
        System.out.println("Unique Words:");
        uniqueWords.forEach(System.out::println);

        // Print word length count map to console
        System.out.println("\nWord Length Count:");
        wordLengthCount.forEach((length, count) -> System.out.println("Length " + length + ": " + count));

        // Write console output to "task4.txt" file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task4.txt", true))) {
            writer.newLine(); // Skip 2 lines after the existing content
            writer.newLine();
            writer.write("Unique Words:");
            writer.newLine();
            for (String word : uniqueWords) {
                writer.write(word);
                writer.newLine();
            }
            writer.newLine();
            writer.write("Word Length Count:");
            writer.newLine();
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                writer.write("Length " + entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Output appended to task4.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
