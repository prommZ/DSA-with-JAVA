import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want : ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
