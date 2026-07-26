class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[]num=s.toCharArray();
        char[]num1=t.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char nums:num)
        {
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(char nums:num1)
        {
        if(!map.containsKey(nums))
        {
            return false;
        }
        map.put(nums,map.get(nums)-1);
        if(map.get(nums)==0)
        {
            map.remove(nums);
        }
        }

        return map.isEmpty();
    }
}
