import java.util.*;

public class Q6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        table(n);
    }
    public static void table(int n){
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
    
}
