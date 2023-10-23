import java.util.Scanner;

public class PosiORNega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n<0) {
            System.out.println("The number is Negative!");
        }
        else if(n>0){
            System.out.println("The nuber is Positive!");
        }
        else{
            System.out.print("The number is ZERO");
           
        }
    }
}
