class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
             // check for odd len palindromes.
             count+=check(s, i, i, n);
             // check for even len palindromes
             count+=check(s, i, i+1, n);
        }
        return count;

    }
    public int check(String s, int l, int h, int n){
        int cnt=0;
        while(l>=0 && h<n && s.charAt(l)==s.charAt(h)){
            cnt++;
            l--;
            h++;
        }
        return cnt;

    }
}
