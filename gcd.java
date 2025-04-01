public class gcd{
    public static int hcf(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        System.out.println(hcf(12,15));
        System.out.println(hcf(12,9));
    }
}