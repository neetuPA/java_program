public class Prime{
    public static void main(String[] args) {
        int lb=2;
        int up=50;
        System.out.println("prime numbers between "+lb+"and"+up+"are");
        for(int num =lb;num<=up;num++){
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;

                }
            }
            if (isPrime){
                System.out.println(num+"");
            }
        }
    }
}
