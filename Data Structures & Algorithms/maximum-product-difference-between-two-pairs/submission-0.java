class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int[]tall=nums.clone();
        Arrays.sort(tall);
        return (tall[n-1]*tall[n-2])-(tall[0]*tall[1]);
        
    }
}