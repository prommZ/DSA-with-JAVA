import java.util.Scanner;

public class AvarageOf3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        float a =sc.nextFloat();
        System.out.print("Enter B : ");
        float b =sc.nextFloat();
        System.out.print("Enter C : ");
        float c =sc.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println("The average of three Number is : " + avg);
    }
}
