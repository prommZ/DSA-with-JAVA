import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter Second number : ");
        float b = sc.nextFloat();
        System.out.print("Enter what you want : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);    
                break;
            case '*': System.out.println(a*b);    
                break;
            case '/':System.out.println(a/b);    
                break;
            case '%':System.out.println(a%b);  
                break;  
            default : System.out.println("Please choose correct option !");
                break;               
        }
    }
}