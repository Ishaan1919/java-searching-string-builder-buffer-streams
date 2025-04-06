import java.io.BufferedReader;
import java.io.FileReader;

public class BufferFileReader {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader( new FileReader("sample.txt"));){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}


//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class BufferFileReader {
//    public static void main(String[] args) {
//        String filePath = "sample.txt";  // Ensure the file exists in the project directory
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = br.readLine()) != null) { // Read line by line
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}