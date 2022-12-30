public class PrintPrime {

    public static void Prime(int n){
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    System.out.println(i+"prime number");
                    break;
                }
            }
        //  if(n%i==0){
        //    System.out.println(n+"is Prime");
        //    return;
        //  }
        //  else{
        //     System.out.println(n+"is not Prime");
        //     return;
        //  }
        }
    }
        public static void main(String args[]){
        int n=64;
        Prime(n);
    }
} 