class Solution {
    public int maxAscendingSum(int[] arr) {
         int n=arr.length;
         if(n==1){
            return arr[0];
         }
         int max=0;
         int sum=0;
         int arrMax=Integer.MIN_VALUE;
         for(int i=0;i<n-1;i++){
            if(arr[i] > arrMax){
                arrMax=arr[i];
            }
            if(arr[i] < arr[i+1] ){
                int j=i;
                while(j<n-1 && arr[j] < arr[j+1]){
                     if(arr[j] > arrMax){
                          arrMax=arr[j];
                     }
                    sum+=arr[j];
                    j++;
                }
                sum+=arr[j];
                max=Math.max(sum, max);
                i=j-1;
            }
            else{
                sum=0;
            }
        
         }
         if(max==0){
            return arr[0]; // coz arr is in descending order
         }
         else if(arrMax > max){
            return arrMax; // whole arr sum can be less than the max number of arr
         }
         return max;
    }
}
