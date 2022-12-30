import java.util.*;

class First{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int numbers[] = new int[size];

    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }

    // for print

    for(int i=0;i<size;i++){
        System.out.print(numbers[i]+" ");
    }
}
}