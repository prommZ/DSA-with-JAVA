import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temp. you have : ");
        float temp = sc.nextFloat();
        if(temp >= 100){
            System.out.println("The man have fever ");
        }
        else{
            System.out.println("The man have no fever !");
        }
    }
}
