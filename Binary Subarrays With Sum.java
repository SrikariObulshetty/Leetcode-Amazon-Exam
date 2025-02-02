class Solution {
    public static int atmost(int arr[], int goal, int n){
        if(goal<0){
            return 0; // else it will cause mistakes if enter the lopp
        }
        int i=0,sum=0,ans=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>goal){ // if will not work it should be while only
                sum-=arr[i++];
            }
            ans+=(j-i+1);
        }
        return ans;


    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int ans1=atmost(nums, goal, n);
        int ans2=atmost(nums, goal-1, n);
        return ans1-ans2;


    }
}
