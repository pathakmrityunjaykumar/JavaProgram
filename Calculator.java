import java.util.*;

public class Calculator {
public static void main(String args[]){
    int a,b;
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("\n Enter operator");
    c=sc.next().charAt(0);
    switch(c){
        case '+':System.out.println(a+b);
        break;
        case '-':if(a>b){
            System.out.println(a-b);
        } else{
            System.out.println(b-a);
        }
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':if(b==0){
            System.out.println("invalied intput of b");
        } 
        else{
            System.out.println(a/b);
        }
        break;
        case '%':if(b==0){
            System.out.println("invailed input of b");
        }
        else{
            System.out.println(a%b);
        }
        break;
        default:System.out.println("invailed input");
        
    }
}
}
