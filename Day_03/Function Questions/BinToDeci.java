import java.util.Scanner;

public class BinToDeci {

    public static void BinToDeci(int BinNum){
        int Deci=0;
        int pow = 0;
        int mynum = BinNum;
        while (BinNum > 0) {

            int rem = BinNum % 10;        
            Deci = Deci + (rem*(int)Math.pow(2, pow));
            pow ++;
            BinNum=BinNum/10;
        }
        System.out.println("Decimal of "+mynum+" is : "+Deci);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        int BinNum = sc.nextInt();
        BinToDeci(BinNum);
    }
}
