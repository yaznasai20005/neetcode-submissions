class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(char ch:s.toCharArray())
        {
           
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         int maxodd=0;
         int minevn=Integer.MAX_VALUE;
        for(int freg:map.values())
        {
            if(freg%2!=0)
            {
                maxodd=Math.max(maxodd,freg);
            }  
        
         if(freg%2==0)
        {
           minevn= Math.min(minevn,freg);
        }
        }
        return maxodd-minevn;
        
    }
}