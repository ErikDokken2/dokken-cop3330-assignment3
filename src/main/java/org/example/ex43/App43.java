package org.example.ex43;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App43 {
    private static ArrayList<String> dataList = new ArrayList<String>();
    private static final Scanner in = new Scanner(System.in);
    private static String siteName;
    private static String authorName;
    private static String javaScrptFileYN;
    private static String cssScrptFileYN;

    public static void main(String[] args) throws FileNotFoundException {
        //read user inputs
        readUserInput();

        File input = new File(siteName);
        //Create a new File
        Createfile();

    }

    private static void Createfile() {
        String html = "<html>\n<head>\n<title>" + siteName + "</title>\n<meta authorName= " +authorName+ ">\n </head>\n</html>";
        File myFile = new File("C:\\Users\\15618\\Documents\\Object Programming\\dokken-cop3330-assignment3\\src\\main\\java\\org\\example\\ex43Help\\index.html");
        try{
            BufferedWriter af = new BufferedWriter(new FileWriter(myFile));
            af.write(html);
            af.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readUserInput() {
        System.out.print("Site name: ");
        siteName = in.nextLine();
        System.out.print("Author: ");
        authorName = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        javaScrptFileYN = in.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        cssScrptFileYN = in.nextLine();
    }
}
