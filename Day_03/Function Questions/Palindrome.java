import java.util.Scanner;

public class Palindrome {

    public static boolean Palindrome(int n){
        int temp=0;
        int number = n;
        while (n != 0 ) {
            temp = temp*10 +n%10;
            n=n/10;
        }
        if (temp==number) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Palindrome(n));
    }
}
