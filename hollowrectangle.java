import java.util.*;
public class hollowrectangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        for(int i = 0;i<height;i++){
            for(int j=0;j<width;j++){
                if(i== 0 || j== 0||i==height-1||j==width-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
    
}
