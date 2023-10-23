import java.util.Scanner;

public class SumOfDigit {

    public static int SumOfDigit(int n){
        int temp=0;
        while(n != 0){
            temp = temp + (n%10);
            n=n/10;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        System.out.println("Sum of Digit in an integer "+n+" is "+SumOfDigit(n) );
    }
}
