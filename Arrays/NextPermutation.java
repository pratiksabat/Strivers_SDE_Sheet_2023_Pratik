class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        

        if(idx==-1){
            // just reverse
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>idx;i--){
        if(nums[i]>nums[idx]){
            swap(nums,i,idx);
            break;
        }
        }

        reverse(nums,idx+1,nums.length-1);
    }

    public void reverse(int[] nums,int l,int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums,int l,int r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
}
