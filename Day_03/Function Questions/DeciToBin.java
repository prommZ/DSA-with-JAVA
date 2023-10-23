import java.util.Scanner;

public class DeciToBin {

    public static void DeciToBin(int DeciNum){
        int BinNum=0;
        int pow = 0;
        int mynum = DeciNum;
        while (DeciNum > 0) {

            int rem = DeciNum % 2;        
            BinNum = BinNum + (rem*(int)Math.pow(10, pow));
            pow ++;
            DeciNum=DeciNum/2;
        }
        System.out.println("Binary of "+mynum+" is : "+BinNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int DeciNum = sc.nextInt();
        DeciToBin(DeciNum);
       
    }
}
