public class numberTriangle{
    public static void main(String args[]){
        int n=5;
        int k=1;

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
    }
}