package main.java.MathLoops;
import java.io.FileWriter;
import java.lang.Math;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter a base value");
    int inputA = scanner.nextInt(); // value
    System.out.println("enter a power value");
    int inputB = scanner.nextInt(); // power

        //create a file
//        try {
//            File myObj = new File("E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\InOut\\Data.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


        // Write a file
        int count;
        try {



            for (int i=0; i<20; i++){
                inputB+=1;
                count=(int) Math.pow(inputA,inputB);

                count+=count;
                FileWriter myWriter = new FileWriter("E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\InOut\\Data.txt");
                System.out.write(count);
                System.out.println(count);

                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
