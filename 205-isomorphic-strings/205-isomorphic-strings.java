class Solution {
    private String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        String r="";
        
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            
            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }
            
           r+=Integer.toString(indexMapping.get(c1));
            r+=" ";
        }
        return r;
    }
    
    public boolean isIsomorphic(String s, String t) {
       
        return transformString(s).equals(transformString(t));
    }
}