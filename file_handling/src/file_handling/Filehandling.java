package file_handling;
import java.io.File;  
import java.io.FileWriter;   
import java.io.IOException;   
import java.io.FileNotFoundException; 
import java.util.Scanner;
public class Filehandling{
  public static void main(String[] args) {
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
	          FileWriter myWriter1 = new FileWriter("filename.txt");
	          myWriter1.write("Appending done using filewriter!");
	          myWriter1.close();
	          System.out.println("Successfully appended the file.");
	        } catch (IOException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	      try {
	        File myObj = new File("filename.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e1) {
	        System.out.println("An error occurred.");
	        e1.printStackTrace();
	      }
	    }
	  


}}