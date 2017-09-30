import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float kl =scn.nextFloat();
        System.out.println(Math.round(kl*0.26418f*10)/10f);
    }
}
