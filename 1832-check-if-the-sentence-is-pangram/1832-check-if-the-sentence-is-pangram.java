class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap();
        int c=0;
        for(int i=0;i<sentence.length();i++){
            if(hm.containsKey(sentence.charAt(i))){
               int f=hm.get(sentence.charAt(i));
                f=f+1;
                hm.put(sentence.charAt(i),f);
                
            }
            else{
                c++;
                hm.put(sentence.charAt(i),1);
                if(c==26) return true;
            }
        
        }
        return false;
    }
}