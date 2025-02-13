class Solution {
    public void convertToNum(String num, int []n){
        for(int i=n.length-1; i>=0;i--){
               n[i]=num.charAt(i)-'0';
        }

    }
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        if(l1 < l2){
            return multiply(num2, num1);
        }
        int n1[]=new int[l1];
        int n2[] = new int [l2];
        int ans[]=new int[1001];
        convertToNum(num1, n1);
        convertToNum(num2, n2);
        int carry=0;
        int ptr=0;
        for(int i=n2.length-1;i>=0;i--){
            int k=1000-ptr;
            carry=0;
            for(int j=n1.length-1;j>=0;j--){
                 int prod=n2[i] * n1[j];
                 int sum=ans[k] + prod + carry;
                 ans[k] = sum % 10;
                 carry = sum / 10;
                 k--;
            }
            ans[k--]+=carry;
            ptr++;
        }
        String s="";
        int idx=0;
       while(idx<1001 && ans[idx]==0){
          idx++;
       }
       if(idx==1001){
          return "0";
       }
       for(; idx<1001;idx++){
          s+=ans[idx];
       }
        return s;
        
    }
}
