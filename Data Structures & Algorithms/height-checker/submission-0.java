class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int[]tall=heights.clone();
        Arrays.sort(tall);
        for(int i=0;i<n;i++)
        {
            if(tall[i]!=heights[i])
            {
                count++;
            }
        }
     
        return count;
        
    }
}