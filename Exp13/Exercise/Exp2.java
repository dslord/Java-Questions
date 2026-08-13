package Exp13.Exercise;

import java.io.*;

public class Exp2 {
    public static void main (String[] args) {
        try {
            FileWriter fw = new FileWriter("Exp13/Exercise/patient.txt");

            fw.write("Patient ID: 101\n");
            fw.write("Name: Amit\n");
            fw.write("Age: 25\n");
            fw.write("Diagnosis: Fever\n");

            fw.close();

            FileReader fr = new FileReader("Exp13/Exercise/patient.txt");
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
