package Exersize1;
import java.util.*;
public class Q2 {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = oddSum(n);
    System.out.println("sum of n Odd number is :"+sum);

}
public static int oddSum(int n){
int sum =0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
           
        }
        else{
           sum= sum+i;
        }
    }
    return sum;
}
    
}
