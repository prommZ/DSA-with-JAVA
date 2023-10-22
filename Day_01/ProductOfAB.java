import java.util.Scanner;

public class ProductOfAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        int mux= a*b;
        System.out.println("The multiplication of two number : " +mux  );
    }
}
