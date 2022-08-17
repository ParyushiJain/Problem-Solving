class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,ArrayList<Integer>> hm1=new HashMap();
        HashMap<Character,ArrayList<Integer>> hm2=new HashMap();
        for(int i=0;i<s.length();i++){
            if(!hm1.containsKey(s.charAt(i))){
                ArrayList<Integer> al=new ArrayList();
                al.add(i);
                hm1.put(s.charAt(i),al);
            }
            else{
                ArrayList<Integer> ta=new ArrayList(hm1.get(s.charAt(i)));
                ta.add(i);
                hm1.put(s.charAt(i),ta);
            }
        }
           for(int i=0;i<t.length();i++){
            if(!hm2.containsKey(t.charAt(i))){
                ArrayList<Integer> al=new ArrayList();
                al.add(i);
                hm2.put(t.charAt(i),al);
            }
            else{
                ArrayList<Integer> ta=new ArrayList(hm2.get(t.charAt(i)));
                ta.add(i);
                hm2.put(t.charAt(i),ta);
            }
        }
        HashSet<String> set1 = new HashSet(hm1.values());
  
        
        HashSet<String> set2 = new HashSet(hm2.values());
        if(set1.equals(set2)) return true;
        else return false;
    }
}