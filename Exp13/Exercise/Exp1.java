package Exp13.Exercise;

import java.io.*;

public class Exp1 {
    public static void main (String[] args) {
        try {
            FileWriter fw = new FileWriter("Exp13/Exercise/employee.txt");

            fw.write("Employee ID: 101\n");
            fw.write("Name: Rahul\n");
            fw.write("Salary: 50000\n");

            fw.close();

            FileReader fr = new FileReader("Exp13/Exercise/employee.txt");
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
