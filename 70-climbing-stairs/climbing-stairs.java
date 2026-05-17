class Solution {
    public int climbStairs(int n) {
        int prev1=3;
        int prev2=2;
        int current=0;
        if(n<=3)return n;
        
        for(int i=4;i<=n;i++)
        {
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
    
}