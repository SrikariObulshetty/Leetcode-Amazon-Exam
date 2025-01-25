class Solution {
    public static int setBits(int num){
        int i=1;
        int setBits=0;
        while(i<=num){
            if( (i&num)>0){
                 setBits++;
            }
            i=i<<1;
        }
        return setBits;
    }
    public int countPrimeSetBits(int left, int right) {
         int ans=0;
         int arr[]=new int[33];
        //sieve of Eratosthenes
          for(int i=2;i<=32;i++){
            for(int j=(i*i);j<=32;j+=i){
                 arr[j]=1;
            }
        }
        for(int i=left;i<=right;i++){
            int countSetBits=setBits(i);
            if(countSetBits>1 && arr[countSetBits]==0){
                 ans++;
            }
        }
        return ans;

    }
}
