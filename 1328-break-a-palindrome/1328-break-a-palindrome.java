class Solution {
    public String breakPalindrome(String palindrome) {
       char[] ch = palindrome.toCharArray();
        boolean flag = false;
        int i;
        for(i = 0; i < palindrome.length()/2; i++)
        {
            if(flag == true)
                break;
            if(palindrome.charAt(i) != 'a')
            {
                ch[i] = 'a';
                flag = true;
                break;
            }
        }
        if(flag == false)
            ch[palindrome.length() - 1] = 'b';
        
        if(palindrome.length() == 1)
            return "";
        return String.valueOf(ch);
    }
}