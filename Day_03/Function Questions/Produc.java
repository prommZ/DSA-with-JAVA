import java.util.Scanner;

public class Produc {
    public static int Product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the first Number : ");
        int b = sc.nextInt();
        System.out.println("The product of two number : "+ (Product(a, b)));
    }
}
