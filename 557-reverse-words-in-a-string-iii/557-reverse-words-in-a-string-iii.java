class Solution {
   
    public String reverseWords(String s) {
        String rev="";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] st=arr[i].toCharArray();
            int l=0;
            int h=st.length-1;
            while(l<=h){
                char t=st[l];
                st[l]=st[h];
                st[h]=t;
                l++;
                h--;
            }
            String tr=String.copyValueOf(st);
           rev=rev+tr;
            rev+=" ";
        
        } 
       rev= rev.trim();
        return rev;
    }
}