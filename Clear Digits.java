class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        Queue<Character>q=new LinkedList<>();
        for(char c :s.toCharArray()){
            if(Character.isDigit(c)){
                q.offer(c);
            }
            else{
                st.push(c);
            }
            while(q.size() > 0 && st.size() >0){
                st.pop();
                q.poll();
            }
        }
        StringBuilder sb =new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
