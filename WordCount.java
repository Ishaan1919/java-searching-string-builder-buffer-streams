import java.io.*;

public class WordCount {
    public static void main(String[] args) {

        String filename = "sample.txt";
        String targetWord = "is";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // split the string
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }
}
