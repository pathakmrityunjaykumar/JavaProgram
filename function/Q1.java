import java.util.*;

public class Q1 {
    public static int sum(int a,int b){
        return(a+b);
      }
  public static void main(String[] args){
    System.out.println("hello World!");

    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();

    int c = sum(a,b);
    System.out.print("sum of two number is "+c);
  }    

  
}
