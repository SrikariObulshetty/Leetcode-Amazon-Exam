class KthLargest {
    PriorityQueue<Integer> pq;
    int k; // neccessary

    public KthLargest(int k, int[] nums) {
         this.k=k;
         pq=new PriorityQueue<>(); // MIN-HEAP
         for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
         }

    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            pq.poll(); // now, kth largest is at root posin
        }
        return pq.peek(); // here it should be peek only, not poll;


    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
