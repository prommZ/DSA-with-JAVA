import java.util.Scanner;

public class SumParameter {
     
    public static void SumTwoNum(int a, int b){
        int sum = a + b;
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        SumTwoNum(a, b);

    }
}
