class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int ans[]=new int[Math.min( nums1.length, nums2.length)];
        int freq[]=new int[1001]; // coz, max len of two arrays is 1000 only
        for(int n:nums1){
            freq[n]++;
        }
        int idx=0; // to know num of intersection elements, then we can return subarray
        // upto that index.
        for(int n:nums2){
            if(freq[n] > 0){
                ans[idx++]=n;
                freq[n]--; // since, ele should be repeated as many times as they're
                            // in both arrays.
            }
        }
        return Arrays.copyOfRange(ans, 0, idx);


    }
}
