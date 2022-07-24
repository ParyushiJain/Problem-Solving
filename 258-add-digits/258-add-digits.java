class Solution {
    // public int digits(int num){
    //     int c=0;
    //     while(num>0){
    //         c++;
    //         num=num/10;
    //     }
    //     return c;
    // }
    public int addDigits(int num) {
        if(num==0) return 0;
        if(num%9==0) return 9;
        else return num%9;
    }
}