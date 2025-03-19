public class SecondLargest {
    public static int printSecondLargest(int []arr){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                   slargest=largest;
                   largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args){
        int arr[]={1,5,2,4,8,10};
        int result=printSecondLargest(arr);
        System.out.println(result);
    }
}
