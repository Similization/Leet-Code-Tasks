package otherTasks.Task459;

public class Task459 {
    public static void main(String[] args) {
        System.out.println(new Solution().repeatedSubstringPattern("abacababacab"));
        System.out.println(new Solution().repeatedSubstringPattern("aba"));
        System.out.println(new Solution().repeatedSubstringPattern("ab"));
        System.out.println(new Solution().repeatedSubstringPattern("abab"));
        System.out.println(new Solution().repeatedSubstringPattern("aabbcaabbc"));
        System.out.println(new Solution().repeatedSubstringPattern("aabbcaabb"));
        System.out.println(new Solution().repeatedSubstringPattern("abcabcabcabcabc"));
    }
}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i = 1, j = 1, k = 0;
        for (; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(k)) {
                ++k;
            } else {
                i = j++;
                k = 0;
            }
        }
        return k % j == 0 && k != 0;
    }
    public boolean repeatedSubstringPattern2(String str) {
        int len = str.length();
        for(int i=len/2 ; i>=1 ; i--) {
            if(len%i == 0) {
                int m = len/i;
                String subS = str.substring(0,i);
                int j;
                for(j=1;j<m;j++) {
                    if(!subS.equals(str.substring(j*i,i+j*i))) break;
                }
                if(j==m)
                    return true;
            }
        }
        return false;
    }
}