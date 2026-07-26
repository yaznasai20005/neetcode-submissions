class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map=new HashMap<>();
       for(int i=0;i<heights.length;i++)
       {
        map.put(heights[i],names[i]);
       }
       int[]t=heights.clone();
       Arrays.sort(t);
       String[]ans=new String[names.length];
       int index=0;
       for(int i=t.length-1;i>=0;i--)
       {
        ans[index++]=map.get(t[i]);
        
       }
       return ans;

        
        
    }
}