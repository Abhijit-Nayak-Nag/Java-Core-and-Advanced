package Day_4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadingExample {
    public static void main(String[] args) {
        String fileName= "example.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.err.println("An error occured while reading the file :" + e.getMessage());
        }
    }

}
