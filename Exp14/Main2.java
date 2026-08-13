package Exp14;

public class Main2 {
    public static void main (String[] args) {
        try {
            String str = "123a";
            int num = Integer.parseInt(str);

            int r = 10 / 0;
            System.out.println(num + r);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error : " + e.getClass().getSimpleName() + " occured.");
        }
    }
}
