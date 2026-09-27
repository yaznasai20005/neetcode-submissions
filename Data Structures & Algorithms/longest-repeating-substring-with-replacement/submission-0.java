class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int Maxfre=0;
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            Maxfre=Math.max(Maxfre,map.get(ch));
            while((right-left+1)-Maxfre>k)
            {
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;
        
       
        
    }
}
