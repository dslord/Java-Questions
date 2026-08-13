package Exp13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Exp13/data.txt");
            fw.write("Hello, this is a Java file handling program.");
            fw.close();

            FileReader fr = new FileReader("Exp13/data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}