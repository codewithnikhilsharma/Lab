package IO;

import java.io.*;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        String fileName = "\"C:\\Users\\Nikhil\\OneDrive\\Pictures\\Documents\\test.txt\"";

        try {
            // Create a File object with the specified file name
            File file = new File(fileName);

            // Create a byte array to hold the file contents
            byte[] fileData = new byte[(int)file.length()];

            // Create a FileInputStream to read the file
            FileInputStream fis = new FileInputStream(file);

            // Read the contents of the file into the byte array
            fis.read(fileData);

            // Close the FileInputStream to release resources
            fis.close();

            // Print the contents of the byte array to the console
            System.out.println(new String(fileData));
        } catch(IOException e) {
            // Print the stack trace of any IOExceptions that occur
            e.printStackTrace();
        }
    }
}

