import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int n){
        for(int i= 2 ;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
