import java.util.*;

public class twonumber {
    public static void main(String args[]){
        int firstnum,secondnum;

        Scanner sc = new Scanner(System.in);
        firstnum=sc.nextInt();
        secondnum=sc.nextInt();

        if(firstnum>secondnum){
            System.out.println(firstnum+" "+secondnum+" firstnumber is greater");
        }
        else{
            System.out.println(secondnum+" "+firstnum+"second number is greater");
        }

    }
}
