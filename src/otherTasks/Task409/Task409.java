package otherTasks.Task409;

public class Task409 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}

class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[52];
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) <= 'Z') {
                chars[s.charAt(i) - 'A' + 26] += 1;
            } else {
                chars[s.charAt(i) - 'a'] += 1;
            }
        }
        int len = 0;
        int maxOdd = 0;
        for (int i = 0; i < 52; ++i) {
            if (chars[i] % 2 == 0) {
                len += chars[i];
            } else if (maxOdd < chars[i]) {
                maxOdd = chars[i];
            }
        }
        return len + maxOdd;
    }
}