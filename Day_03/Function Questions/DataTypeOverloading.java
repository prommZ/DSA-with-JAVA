public class DataTypeOverloading {
    public static void Sum(int a, int b){
        System.out.println(a+b);
    }
    public static void Sum(int a , int b, int c){
        System.out.println(a+b+c);
    }
     public static void Sum(float a, float b){
        System.out.println(a+b);
    }
    public static void Sum(float a , float b, float c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Sum(2, 3);
        Sum(1, 2, 3);
        Sum(26.4f, 9.4f);
        Sum(2.9f, 6.4f, 99.8f);
    }
}
