package Exersize1;
import java.util.*;


public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the X and N value:");
        int x= sc.nextInt();
        int i = sc.nextInt();
        int pow = power(x,i);
        System.out.println("the "+x+" to the power of "+i+" = "+ pow);
    }
    public static int power(int x, int i){
        int pow = 1;
        for(int j=0;j<i;j++){
         pow *= x;
        }
        return(pow);
    }
    
}
