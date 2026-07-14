// Create a To-Do List application using ArrayList to store tasks and StringBuffer to display tasks.
package Exp5.Exercise;

import java.util.ArrayList;

public class Ex1 {
    public static void main (String[] args) {
        ArrayList<String> arr = new ArrayList<>();
    
        arr.add("Study");
        arr.add("Play a sport");
        arr.add("Coding");
        arr.add("Build a project");
        arr.add("Nap");
    
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < arr.size(); i++) {
            str.append((i + 1) + "." + arr.get(i) + "\n");
        }

        System.out.println("------ TO DO List ------");
        System.out.println(str);
    }
}
