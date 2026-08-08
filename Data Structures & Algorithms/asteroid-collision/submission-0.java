class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int current:asteroids)
        {
               boolean alive=true;
            while(!stack.isEmpty()&&stack.peek()>0&&current<0)
            {
                int top=stack.peek();
                if(Math.abs(top)>Math.abs(current))
                {
                    alive=false;
                    break;
                }
                else if(Math.abs(stack.peek())==Math.abs(current))
                {
                    stack.pop();
                    alive=false;
                    break;
                }
                else {
                    stack.pop();
                    
                }
            }
            if(alive)
            {
                stack.push(current);
            }
        }
       int []results=new int[stack.size()];
       for(int i=0;i<stack.size();i++)
       {
        results[i]=stack.get(i);
       }
       return results;
        
    }
}