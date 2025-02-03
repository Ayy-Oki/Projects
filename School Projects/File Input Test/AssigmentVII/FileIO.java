package AssigmentVII;

import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //// takes in file name
        System.out.println("Enter the name of the input file: ");
        String name = scnr.nextLine();
        File inputFile = new File(name);

        ///error message if file doesn't exist
        if (!inputFile.exists()) {
            System.out.println("File not found. Please ensure the file is in the same directory as the program.");
            return; // Exit if the file does not exist
        }

        ///the loop in question makes sure that we don't have a repeat file
        File tempFile = new File("Temp1.txt");
        int tempFileNum = 1;
        while (tempFile.exists()) {
            tempFile = new File("Temp" + tempFileNum + ".txt");
            tempFileNum++;
        }

        try (BufferedReader buffread = new BufferedReader(new FileReader(inputFile));
             BufferedWriter buffwrite = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = buffread.readLine()) != null) {
                StringBuilder modline = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    char currentchar = line.charAt(i);
                    modline.append(currentchar);

                    // Checks there is a period and adds \n
                    if (currentchar == '.') {
                        // Write the completed sentence to the temp file
                        buffwrite.write(modline.toString().trim());
                        buffwrite.newLine();
                        modline.setLength(0); // Reset the StringBuilder for the next sentence
                    }
                }

                // To handle any remaining text not ending with a period
                if (modline.length() > 0) {
                    buffwrite.write(modline.toString().trim());
                    buffwrite.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Copy the formatted content back to the original file
        try (BufferedReader buffread = new BufferedReader(new FileReader(tempFile));
             BufferedWriter buffwrite = new BufferedWriter(new FileWriter(inputFile))) {

            String line;
            while ((line = buffread.readLine()) != null) {
                buffwrite.write(line);
                buffwrite.newLine();
            }

            System.out.println("File content formatted successfully!");

            // Deletes the temporary file
            if (tempFile.delete()) {
                System.out.println("Temporary file deleted.");
            } else {
                System.out.println("Failed to delete the temporary file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
