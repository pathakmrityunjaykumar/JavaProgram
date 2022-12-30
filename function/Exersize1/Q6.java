package Exersize1;
import java.util.*;


public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        voteright(age);
    }
    public static void voteright(int age){
        if(age>18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }
    
}
