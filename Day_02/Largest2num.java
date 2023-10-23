import java.util.Scanner;

public class Largest2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        float a = sc.nextFloat();
        System.out.print("Enter Second number : ");
        float b = sc.nextFloat();
        if (a < b) {
            System.out.println(b+" is greater than " +a);
        }
        else{
            System.out.println(a+" is greater than " +b);
        }

    }
}
