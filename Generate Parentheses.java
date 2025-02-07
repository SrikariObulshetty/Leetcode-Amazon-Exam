class Solution {
    // if you use a string builder, u have to remove the last char after evry function call, for string no need...
    public static void helper(int ob, int cb, List<String>ans, StringBuilder str){
         if(ob==0 && cb==0){
            ans.add(str.toString() );
            return;
         }
         // DON'T GIVE ob-- or cb--, it will not reduce values, give ob-1 or cb-1 only....
         if(ob==cb){
            // only one choice to take opening bracket.
            helper( ob-1, cb, ans, str.append("("));
            str.deleteCharAt(str.length() - 1);
         }
         else if(ob==0){
             helper(ob, cb-1, ans, str.append(")"));
             str.deleteCharAt(str.length() - 1);
         }
         // open brackets < closing brackets
         else{
            helper(ob-1, cb, ans, str.append("("));
            str.deleteCharAt(str.length() - 1);
            helper(ob, cb-1, ans, str.append(")"));
            str.deleteCharAt(str.length() - 1);
         }

    }
    public List<String> generateParenthesis(int n) {
         List<String>ans=new ArrayList<>();
         StringBuilder sb=new StringBuilder();
         helper(n, n, ans, sb);
         return ans;

    }
}
