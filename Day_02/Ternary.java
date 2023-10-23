import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String var = (num%2 == 0)? "even number " : "odd number ";
        System.out.println(var);
    }
}
