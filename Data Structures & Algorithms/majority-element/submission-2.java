class Solution {
    public int majorityElement(int[] nums) {
   
  HashMap<Integer,Integer>map=new HashMap<>();
  for(int num:nums)
  {
    map.put(num,map.getOrDefault(num,0)+1);
  }
  int max=0;
  int maxfrq=0;
  for(int num:map.keySet())
  {
    if(map.get(num)>maxfrq)
    {
        maxfrq=map.get(num);
        max=num;
    }
  }
  return max;
        
    }
}