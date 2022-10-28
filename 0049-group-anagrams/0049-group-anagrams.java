class Solution {
    public List<List<String>> groupAnagrams(String[] st) {
        HashMap<String,List<String>> hm=new HashMap();
        for(int i=0;i<st.length;i++){
            char[] ta=st[i].toCharArray();
            Arrays.sort(ta);
            String t=new String(ta);
            if(!hm.containsKey(t)){
                List<String> ls=new ArrayList();
                ls.add(st[i]);
                hm.put(t,ls);
            }
            else{
               List<String> a=hm.get(t);
                a.add(st[i]);
                hm.put(t,a);
            }
        }
        List<List<String>> r=new ArrayList();
        for(List<String> is:hm.values()){
            r.add(is);
        }
        return r;
    }
}