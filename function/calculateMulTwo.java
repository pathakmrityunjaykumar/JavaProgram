import java.util.Scanner;

public class calculateMulTwo{
    public static  int mulTwo(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        System.out.print("Enter the two number :");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int mul=mulTwo(a,b);
        System.out.println("the two number multiply="+mulTwo(a,b));
    }
}
