package in.exceptionandfilehandling.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args) {
        String fileName= "java-course.txt";
//        try{
//            FileWriter writer= new FileWriter(fileName);
//            writer.write("This is the best java course.");
//            writer.flush();
//            System.out.println("file written successfully");
//        }catch (IOException exception){
//            System.out.printf("Exception occured %s\n" , exception.getMessage());
//        }

 //- if we write inside try catch block then we need to close the writer object manually
 // if we use try with resource then we don't need to close the writer object manually java
 // will take the responsibility of closing the object and we dont need to close the object.

        try(FileWriter writer= new FileWriter(fileName)){
            writer.write("This is the best java course.\n");

//if someone says you write 10000 starts inside your java-course.txt file then we just need to use a for loop.
            for(int i=0; i<1000; i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("file written successfully");
        } catch (IOException e) {
            System.out.printf("Exception occurs %s", e.getMessage() );
        }


    }
}
