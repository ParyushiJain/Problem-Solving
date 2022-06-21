class Solution {
    public boolean check(String s,int start,int end){
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    List<List<String>> r;
    public List<List<String>> partition(String s) {
      r=new ArrayList();
       List<String> ip=new ArrayList<String>();
        solve(0,s,ip);
      return r;      
    }
    public void solve(int idx,String s,List<String> ip){
        if(idx==s.length()){
            r.add(new ArrayList<>(ip));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                ip.add(s.substring(idx, i + 1));
                solve(i+1,s,ip);
                ip.remove(ip.size()-1);
            }
        }
    }
}