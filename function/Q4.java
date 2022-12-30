import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Q4 {

public static void main(String[] args){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    isPrime(n);

    
}
public static void isPrime(int n){
    int x =0;
    for(int i = 2;i<n/2;i++){
        
        if(n%i==0){
            System.out.println("not a prime number");
            x++;
            break;
           
        }
        
}
if(x==0){
    System.out.println("prime number");
}
}
    
}
