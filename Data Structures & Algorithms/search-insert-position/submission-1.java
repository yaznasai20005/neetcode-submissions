class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int right=n-1;
        int ans=0;
        while(start<=right)
        {
            int mid=start+(right-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
            else
            {
                start=mid+1;
            }
            ;
        }
        return start;
        
    }
}