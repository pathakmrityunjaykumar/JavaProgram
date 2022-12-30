import java.util.*;

public class Q3 {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = multi(a,b);
        System.out.println("result of two multiply number is :"+mul);
    }
    public static int multi(int a,int b){
        return(a*b);
    }
}
