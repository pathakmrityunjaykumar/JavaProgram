import java.util.*;
public class Printevennum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the even number till there:");
        int num = sc.nextInt();
        for(int i=1;i<= num ;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
