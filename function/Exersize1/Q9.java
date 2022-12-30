package Exersize1;
import java.util.*; 

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        series(size);
    }
    public static void series(int size){
        int a = 0;
        int b=1;
        System.out.print(a+" ");
        if(size>1){
        for(int j=2;j<size;j++){
            System.out.print(b+" ");
            int temp = b;
            b=a+b;
            a=temp;
            
        }
        System.out.println();
    }
    }
    
}
