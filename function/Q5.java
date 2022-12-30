import java.util.*;
public class Q5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

       boolean x= isOddEven(number);
       if(x==true){
        System.out.println("even");
       }
       else {
        System.out.println("odd");
       }
    }

    public static boolean isOddEven(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
