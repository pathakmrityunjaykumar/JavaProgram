package Exersize1;
import java.util.*;


public class Q4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float radius = sc.nextInt();
        double area= Area(radius);
        double circumference = Circumference(radius);
        System.out.println("the circle of area is "+area);
    System.out.println("the circumference is "+circumference);

    }
    public static double Area(float redius){
        double x=3.14*(redius*redius);
        return (x);    }

        public static double Circumference(float redius){
            double x=(2*3.14)*redius;
            return(x);
        }
    
}
