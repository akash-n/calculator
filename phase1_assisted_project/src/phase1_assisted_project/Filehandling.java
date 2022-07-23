package phase1_assisted_project;
import java.io.File;  
import java.io.FileWriter;   
import java.io.IOException;   
import java.io.FileNotFoundException;
public class Filehandling {
  public static void main(String[] args) throws IOException {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
  } try {
      FileWriter myObj = new FileWriter("filename.txt");
    
      myObj.write("data");
      myObj.close();
      System.out.println("data added");
      }
    
     catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
