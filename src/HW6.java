import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char word = scn.next().charAt(0);
        System.out.println(string.replace(word,'\n'));
    }
}
