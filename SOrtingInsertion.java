public class SOrtingInsertion{
    public static void sorting(int []arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;


        }
        }
        public static void main(String[] args){
            int arr[]={4,3,7,8,6};
            sorting(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
