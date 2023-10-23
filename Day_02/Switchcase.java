import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter what you want : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':System.out.println("Samosa");
                break;
            case 'B':System.out.println("Fruit juice");    
                break;
            case 'C': System.out.println("Banana");    
                break;
            case 'D':System.out.println("Pasta");    
                break;
            case 'E':System.out.println("Salad");  
                break;  
            case 'F':System.out.println("Water");
                break;
            default : System.out.println("Please choose correct option !");
                break;
                
        }
    }
}
