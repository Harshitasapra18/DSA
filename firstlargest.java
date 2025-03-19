public class firstlargest{
    public static int printLargest(int []arr){

        int greatest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }

        }
        return greatest;
        
    }
    public static void main(String[] args){
        int arr[]={1,3,2,7,5,10,6};
        int result=printLargest(arr);
        System.out.println(result);
    }
}