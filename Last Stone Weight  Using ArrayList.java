class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n==1){
            return stones[0];
        }
        ArrayList<Integer>arrl=new ArrayList<>();
        for(int k:stones){
            arrl.add(k);
        }
        while(arrl.size() > 1){
            Collections.sort( arrl, Collections.reverseOrder() );
            int m1=arrl.get(0);
            arrl.remove(Integer.valueOf(m1));
            int m2=arrl.get(0);
            arrl.remove( Integer.valueOf(m2) );
            if(m1-m2 !=0){
                arrl.add(m1-m2);
            }
        }
        if(arrl.size()==0){
            return 0;
        }
        return arrl.get(0);



    }
}
