import java.util.Scanner;

public class CostOf3product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter MRP of Pen : ");
        float Pen = sc.nextFloat();
        System.out.print("Enter MRP of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.print("Enter MRP of Earser : ");
        float Earser = sc.nextFloat();
        float wtax = Pen + Pencil + Earser;
        float Itax = (Pen + Pen*.18f) + (Pencil + Pencil*.18f) + (Earser + Earser*.18f);
        System.out.println("The total amount without taxes is : " + wtax);
        System.out.println("The total amount with all taxes is : " +Itax);
    }
}
