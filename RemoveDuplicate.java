public class RemoveDuplicate{
    public  static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
        
    }
    public static void main(String[] args){
        int nums[]={1,1,2,2,3,3};
        int result=removeDuplicates(nums);
        System.out.println(result);
    }
}