import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum =1;
        if (n==0) {
            System.out.println("factorial of 0 is 1");
        }
        else{
            for(int i=n; i>=1;i--){
                sum = sum*i;
            }
            System.out.println(sum);
        }
    }
}
