class Solution {
    public static void createMap(String []strs, int n, HashMap<String, ArrayList<String>>map){
          for(String s : strs){
             char arr[] = s.toCharArray();
             Arrays.sort(arr);
             String k=String.valueOf(arr);
             if( map.containsKey(k) ){
                  map.get(k).add(s);
             }
             else{
                ArrayList<String>al=new ArrayList<>();
                al.add(s);
                map.put(k, al);
            }
        }
    }
    public static void prepList(HashMap<String, ArrayList<String> >map, List<List<String>>ans){
        for(String key:map.keySet()){
            // sort each grp of anagrams.
            Collections.sort( map.get(key) );
            ans.add( map.get(key) );
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String, ArrayList<String> > map = new HashMap<>();
        createMap(strs, strs.length, map);
        ans=new ArrayList<>(map.values()); // new way I learnt to write.
        return ans;
    }
}
