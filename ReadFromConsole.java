import java.io.*;

public class ReadFromConsole {
    public static void main(String[] args) {

        String filename = "sample.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filename, true); // Append mode
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Move to the next line
            }
            System.out.println("Input saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
