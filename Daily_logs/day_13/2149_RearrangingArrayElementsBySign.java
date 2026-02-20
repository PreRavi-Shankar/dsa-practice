class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m=0;
        int n=1;
        int[] arr = new int[nums.length];
     for (int i=0; i<nums.length;i++) {
        if (nums[i]>0){
          arr[m]=nums[i];
          m+=2;
        }else{
            arr[n]=nums[i];
            n+=2;
        }
        
     }
     return arr; 
    }
}