package Exersize1;
import java.util.*;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float x = avg(a,b,c);
        System.out.println("the average of "+a+","+b+","+c+" is :"+x);

    }
    public static float avg(int a ,int b,int c){
        return((a+b+c)/3);
    }

    
}
