import java.util.*;
public class PrimeOptmised {

    public static boolean isPrime(int n){
        for(int i =2 ; i<=Math.sqrt(n); i++){
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