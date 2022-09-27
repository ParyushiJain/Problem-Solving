class Solution {
    public String pushDominoes(String d) {
       char[] a=new char[d.length()+2];
        a[0]='L';
        a[d.length()+1]='R';
        
        for(int i=1;i<a.length-1;i++){
            a[i]=d.charAt(i-1);
        }
        
        int j=0;
        int k=1;
        while(k<a.length){
            while(a[k]=='.') k++;
            solve(a,j,k);
            j=k;
            k++;
        }
        String string = String.copyValueOf(a);
        string=string.substring(1,string.length()-1);
        return string;
        
    }
    public void solve(char[] a,int i,int j){
        if(a[i]=='L' && a[j]=='L'){
            for(int k=i+1;k<j;k++){
                a[k]='L';
            }
        }
        else if(a[i]=='R' && a[j]=='R'){
            for(int k=i+1;k<j;k++){
                a[k]='R';
            }
        }
        else if(a[i]=='R' && a[j]=='L'){
            int dt=j-i;
            int m=(i+j)/2;
            if(dt%2==0){
                for(int k=i+1;k<m;k++){
                    a[k]='R';
                }
                for(int k=m+1;k<j;k++){
                    a[k]='L';
                }
            }
            else{
               for(int k=i+1;k<=m;k++){
                    a[k]='R';
                }
                for(int k=m+1;k<j;k++){
                    a[k]='L';
                }  
            }
        }
    }
}