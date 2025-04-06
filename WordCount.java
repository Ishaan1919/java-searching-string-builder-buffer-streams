import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            int wordCount = 0;
            String word = "is";
            String line;
            while((line=br.readLine())!=null){
                if(line.contains(word)) wordCount++;
            }
            System.out.printf("The count of the word \"%s\" is %d", word,wordCount);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}



//import java.io.*;
//
//public class WordCount {
//    public static void main(String[] args) {
//
//        String filename = "sample.txt";
//        String targetWord = "is";
//        int count = 0;
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split("\\s+"); // split the string
//                for (String word : words) {
//                    if (word.equalsIgnoreCase(targetWord)) {
//                        count++;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file: " + e.getMessage());
//        }
//
//        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
//    }
//}
