import java.util.*;
public class Q2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("factorial of that number is "+factorial);
    }

    public static int fact(int n){
      
    
    int z = 1 ;
    if(n==0){
        return z;
    }
    for(int i=n;i>0;i--)
    {
        z *= i;
    }
    return z;  
    }

}
