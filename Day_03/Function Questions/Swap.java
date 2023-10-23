import java.util.Scanner;

public class Swap {

    public static void Swap( int a , int b){
        int temp= a;
        a=b;
        b=temp;
        System.out.println("a = "+a+ "\nb = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        Swap(a,b);
    }
}
