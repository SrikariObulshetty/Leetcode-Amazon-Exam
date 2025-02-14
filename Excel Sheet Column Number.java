class Solution {
    public int titleToNumber(String columnTitle) {
         int ans=0;
         for(char c:columnTitle.toCharArray()){
              int num=c-'A'+1;
              ans=(ans*26) + num;
         }
         return ans;
    }
}
