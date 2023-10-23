import java.util.*;
public class weekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Day number : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:System.out.println("Sunday");
                
                break;
            case 2 : System.out.println("Monday");    
                break;
            case 3 : System.out.println("Tuseday");    
                break;
            case 4 : System.out.println("Wednesday");    
                break;
            case 5 : System.out.println("Thursday");    
                break;
            case 6 : System.out.println("Friday");    
                break;
            case 7 : System.out.println("Saturday");    
                break;
            default:System.out.println("Please choose correct options");
                break;
        }
    }
}
