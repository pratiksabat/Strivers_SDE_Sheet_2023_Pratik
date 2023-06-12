class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0],sum=0;

        for(int num:nums){
            sum+=num;
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0) sum=0;
        }
        return maxi;
    }
}
