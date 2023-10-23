import java.util.Scanner;

public class Average3Num {

    public static int Average3Num(int a, int b , int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
       System.out.println("Average of three number is : " + Average3Num(a,b,c));
    }
}
