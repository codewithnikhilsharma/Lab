package IO;

//Import the necessary classes for file and console I/O
import java.io.*;

public class FileReadWrite {
 public static void main(String[] args) {
     // Create a BufferedReader object to read user input from the console
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     // Set the name of the file to store data in
     String fileName = "data.txt";

     try {
         // Prompt the user to choose an option
         System.out.println("Choose an option:");
         System.out.println("1. Store data");
         System.out.println("2. Print data");

         // Read the user's choice from the console
         int choice = Integer.parseInt(br.readLine());

         // Switch based on the user's choice
         switch(choice) {
             case 1:
                 // Prompt the user to enter data to store in the file
                 System.out.println("Enter data to store:");
                 String data = br.readLine();
                 // Create a FileWriter object to write data to the file
                 FileWriter fw = new FileWriter(fileName);
                 // Write the data to the file
                 fw.write(data);
                 // Close the FileWriter object to flush the data to the file and release resources
                 fw.close();
                 // Inform the user that the data was stored successfully
                 System.out.println("Data stored successfully!");
                 break;

             case 2:
                 // Create a FileReader object to read data from the file
                 FileReader fr = new FileReader(fileName);
                 // Use a loop to read each character from the file and print it to the console
                 int ch;
                 while((ch = fr.read()) != -1) {
                     System.out.print((char)ch);
                 }
                 // Close the FileReader object to release resources
                 fr.close();
                 break;

             default:
                 // Inform the user that their choice was invalid
                 System.out.println("Invalid choice!");
                 break;
         }
     } catch(IOException e) {
         // Print the stack trace of any IOExceptions that occur
         e.printStackTrace();
     }
 }
}

