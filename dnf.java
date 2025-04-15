public class dnf {
    public static void dnfsort(int []arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

    }
    public static void main(String[] args){
        int arr[]={1,1,0,2,0,0,1};
        dnfsort(arr);
        System.out.println("sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}
