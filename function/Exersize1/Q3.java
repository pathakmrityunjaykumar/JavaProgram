package Exersize1;
import java.util.*;

import javax.print.attribute.standard.RequestingUserName;


public class Q3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int x =greate(a,b);
        System.out.println(a+"and "+b+"greten of that:"+x);


    }
    public static int greate(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
