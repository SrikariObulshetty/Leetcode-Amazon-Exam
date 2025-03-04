class Solution {
    private boolean isPrime(int num){
        if(num==1 || num==0)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int num = i;
            int count=0;
            while(num>0){
                int bit = num%2;
                if(bit==1){
                    count++;
                }
                num=num/2;
            }
            if(isPrime(count))ans++;
        }
        return ans;
    }
}
