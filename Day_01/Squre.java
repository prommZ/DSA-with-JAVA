import java.util.Scanner;

public class Squre {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the side of a squre : ");
        float a = sc.nextFloat();
        float area = a*a;
        System.out.println("The area of a squre is : " +area);
    }
}
