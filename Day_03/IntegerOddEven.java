import java.util.Scanner;

public class IntegerOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int evenSum =0,oddSum=0;
        do {
            System.out.print("Enter the number : ");
            int n = input.nextInt();
            if (n % 2 == 0) {
                evenSum= evenSum+n;
            }
            else{
                oddSum = oddSum + n;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = input.nextInt();
        } while (choice==1);
        System.out.println("Sum of even numbers : "+evenSum);
        System.out.println("Sum of odd number is : "+oddSum);
    }
}
