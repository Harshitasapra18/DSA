public class prime {
    public static boolean isprime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count>2){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isprime(5));
        System.out.println(isprime(24));
    }
    
}
