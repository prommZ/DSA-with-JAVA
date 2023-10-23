import java.util.Scanner;

public class ReturnSumPara {
    public static int SumTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("The sum is : "+ (SumTwoNum(a, b)));

    }
}
