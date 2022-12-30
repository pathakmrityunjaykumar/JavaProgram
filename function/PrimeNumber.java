import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class PrimeNumber {
    public static int prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return(0);
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
       int x= prime(n);
       if(x==0){
        System.out.println(n+" is prime number");
       }
       else{
        System.out.println(n+" not a prime number");
       }

    }
    
}
