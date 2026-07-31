class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String op:operations)
        {
            if(op.equals("+"))
            {
                int last=stack.pop();
                int first=stack.peek();
                stack.push(last);
                stack.push(last+first);
            }
            else if(op.equals("D"))
            {
                int dob=stack.peek()*2;
                stack.push(dob);
            }
            else if(op.equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
        sum+=stack.pop();
        }
        return sum;
        
    }
}