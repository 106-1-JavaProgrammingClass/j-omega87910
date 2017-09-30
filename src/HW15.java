import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str =scn.next();
        int n =Integer.valueOf(str,16);
        System.out.println((char)n);
    }
}
