import java.util.*;

public class Marks {
    public static void main(String args[]){
       int input;
       Scanner sc = new Scanner(System.in);
       do{
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("this is good");
        }
        else if(marks>=60 && marks <90){
            System.out.println("this is also good");

        }
        else if(marks>=0 && marks<60){
            System.out.println("this is good as well");
        }
        else{
            System.out.println("invailed");
        }
        System.out.println("Do you want to continue? is yes press=1 if no press=0");

        input = sc.nextInt();
       }while(input == 1);
    }
    
}
