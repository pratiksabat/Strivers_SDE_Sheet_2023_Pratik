class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,m=0;

        while(m<=r){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1) m++;
            else{
                swap(nums,m,r);
                r--;
            }
        }
    }

    public void swap(int[] nums,int l, int r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
}
