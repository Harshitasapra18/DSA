public class ArrayIsSorted {
    public static boolean issorted(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[]={1,1,2,3,5,6};
        boolean result=issorted(arr);
        System.out.println(result);
    }
}
