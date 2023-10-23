import java.util.*;
public class Largest3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();

       if(a >= b && a >= c){
        System.out.println(a+" is bigger in three number!");
       }
       else if (b >= c) {
        System.out.println(b+ " is bigger in three number!");
       } 
       else {
        System.out.println(c+ " is bigger in three number!");
       }
    }
}
