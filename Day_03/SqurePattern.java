import java.util.*;
public class SqurePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number how big Squre you want : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= n ;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
