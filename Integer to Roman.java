class Solution {
    public class Pair{
       int dig;
       int pos;
       Pair(int dig, int pos){
           this.dig=dig;
           this.pos=pos;
       }
    } 
    public String intToRoman(int num) {
         HashMap<Integer, String>map=new HashMap<>();
         Stack<Pair> st=new Stack<>();
         map.put(1,"I");
         map.put(5,"V");
         map.put(10,"X");
         map.put(50,"L");
         map.put(100,"C");
         map.put(500,"D");
         map.put(1000,"M");
         map.put(4,"IV");
         map.put(9,"IX");
         map.put(40,"XL");
         map.put(90,"XC");
         map.put(400,"CD");
         map.put(900,"CM");
         int pow=1;
         while(num > 0){
            int r=num%10;
            st.push(new Pair(r,pow));
            pow*=10;
            num/=10;
         }
         String ans="";
         while(st.size() > 0){
             Pair p=st.pop();
             int d=p.dig;
             int tens=p.pos;
             if(d<=3){
                while(d>0){
                    ans+=map.get(tens);
                    d--;
                }
             }
             else if(d<5){
                ans+=map.get(tens * d);
             }
             else if(d==5){
                 ans+=map.get(5*tens);
             }
             else if(d>5 && d<=8){ 
                 ans+=map.get(5*tens);
                 d-=5;
                 while(d>0){
                    ans+=map.get(tens);
                    d--;
                 }
             }
             else{
                ans+=map.get(tens *d);
             }

         }
         return ans;

    }
}
