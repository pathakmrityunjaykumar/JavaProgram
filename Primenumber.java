import java.util.*;
public class Primenumber {
    public static void main(String args[]){
        System.out.print("Enete the number till prime number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =2;i<=num;i++)
        {
            for(int j = 2;j<=i;j++)
            {
                if(i%j == 0){
                    System.out.println(j);
                }
            }
            // if(num%i==0){
            //     System.out.println(i);
            // }
        }
    }
    
}
