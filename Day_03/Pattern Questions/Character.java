import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines you want to print : ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
}
