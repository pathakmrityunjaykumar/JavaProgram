package Exersize1;
import java.util.*;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int cout1=0;
        int cout2=0;
        int cout3=0;

        while(x==0){
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            if(number>0){
                cout1++;
            }
            else if(number<0){
                cout2++;
            }
            else{
                cout3++;
            }
            System.out.println("exit press enter 1 coutinue press 0");
            x = sc.nextInt();
            
        }

        System.out.println("Positive number:"+cout1+" Negative number: "+cout2+" Zero time :"+cout3);
    }
    
    }
    

