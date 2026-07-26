class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
            
        ArrayList<Integer>list=new ArrayList<>();
        
       
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
    for(int  num1:map.keySet())
    {
        if(map.get(num1)>n/3)
        {
          list.add(num1);
        }
    }
    return list;
       
        
    }
     
    }
