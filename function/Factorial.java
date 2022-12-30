import java.util.*;

public class Factorial {
   
   public static int factorial(int n){
    int fat=1;
    for(int i=1;i<=n;i++){
        fat=fat*i;
    }
    return fat;
   }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n= sc.nextInt();
        System.out.println(n+"factorial="+factorial(n));


   }    
}
