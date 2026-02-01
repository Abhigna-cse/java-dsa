//platform:leetcode
//approach: greedy
// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
    int min_price=Integer.MAX_VALUE;
    int max_profit=0;
    for(int price:prices){
        if(price<min_price){
            min_price=price;
        }
        else{
            max_profit=Math.max(max_profit,price-min_price);
        }
    }
    return max_profit;
    }
}
