class Solution {
    public int buyChoco(int[] prices, int money) {
        int[]t=prices.clone();
        Arrays.sort(t);
        int cost=t[0]+t[1];
        if(cost<=money)
        {
            return money-cost;
        }
        return money;
        
    }
}