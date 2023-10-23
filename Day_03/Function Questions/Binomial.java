import java.util.Scanner;

public class Binomial {
    public static int Binomial(int n){
        int fact = 1;
        for(int i =1 ; i<=n ; i++){
            fact = fact * i ;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R : ");
        int r = sc.nextInt();
        int Bin;
        int N_fact=Binomial(n);
        int R_fact=Binomial(r);
        int nr_fact=Binomial(n-r);
        Bin = N_fact / (R_fact * nr_fact);
        System.out.println("The binomial of "+n+ "^C "+r+ "is : "+Bin);
    }
}
