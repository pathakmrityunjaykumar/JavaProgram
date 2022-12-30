import java.util.*;
public class solidrec {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter height and width of reatangle:");
        int height = sc.nextInt();
        int width = sc.nextInt();
        for(int i =0 ;i<height;i++){
            for(int j=0;j<width;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
