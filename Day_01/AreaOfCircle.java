import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr the Radius of circle : ");
        float r = sc.nextFloat();
        float ar = 3.14f*r*r;
        System.out.println("The Area of Circle is : "+ar);
    }
}
