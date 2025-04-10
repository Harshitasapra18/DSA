public class binarysearch {
    public static int searching(int []arr,int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int n=arr.length;
        int target=4;
        int result=searching(arr,n,target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
    
}
