import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToChar {
    public static void main(String[] args) {
        long start = System.nanoTime();
        try(FileInputStream fr = new FileInputStream("sample.txt");
            InputStreamReader isr = new InputStreamReader(fr, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr)){
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
        } catch(IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println(end-start);

        start = System.nanoTime();
        BufferFileReader.main(new String[0]);
        end = System.nanoTime();
        System.out.println(end-start);
    }
}




//import java.io.*;
//import java.nio.charset.StandardCharsets;
//
//public class ByteToChar {
//    public static void main(String[] args) {
//
//        String filename = "sample.txt";
//
//        try (FileInputStream fis = new FileInputStream(filename);
//             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
//             BufferedReader reader = new BufferedReader(isr)) {
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error reading file : " + e.getMessage());
//        }
//    }
//}
