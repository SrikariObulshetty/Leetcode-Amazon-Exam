class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int ans[]=new int[Math.min(nums1.length, nums2.length)];
        int freq[]=new int[1001]; // lens of nums1,nums2 will be at max 1000 
        for(int n:nums1){
            freq[n]++;
        }
        int idx=0;
        for(int n:nums2){
            if(freq[n] > 0){
                freq[n]=0;
                ans[idx++]=n;
            }
        }
        return Arrays.copyOfRange(ans, 0, idx); //give only filled part of array 
    }
}
