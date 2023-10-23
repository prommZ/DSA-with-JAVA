import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age :");
        int n = sc.nextInt();
        if(n > 13 && n < 18)
        {
            System.out.println("You are now teenager");
        }
        if (n>=18) {
            System.out.println("You are now adult");
        }
        else {
            System.out.println("You are child");
        }
    }
}
