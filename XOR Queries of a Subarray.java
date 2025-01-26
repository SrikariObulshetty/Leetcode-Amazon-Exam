class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
         // precomputation works here 
         // use prefix sum
         int n=queries.length;
         int prefix[]=new int[arr.length];
         int xor=0;
        for(int i=0;i<arr.length;i++){
             xor=xor^arr[i];
             prefix[i]=xor;
        }
        int ans[]=new int[n];
        int idx=0;
        for(int []temp:queries){
            int l=temp[0];
            int r=temp[1];
            if(l==0){
                ans[idx++]=prefix[r];
            }
            else{
                ans[idx++]=prefix[r]^prefix[l-1];
            }
        }
        return ans;

    }
}
