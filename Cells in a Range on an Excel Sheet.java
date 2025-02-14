class Solution {
    public List<String> cellsInRange(String s) {
        char arr[]=s.toCharArray();
        char c1=arr[0];
        int r1=arr[1]-'0';
        char c2=arr[3];
        int r2=arr[4]-'0';
        List<String>ans=new ArrayList<>();
        while(c1<=c2){
            String tmp=c1+"";
            int r=r1;
            while(r<=r2){
                ans.add(tmp+r+"");
                r++;
            }
            c1++;
        }
        return ans;
    }
}
