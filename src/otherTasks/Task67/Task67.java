package otherTasks.Task67;

public class Task67 {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary2(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
//        System.out.println(new Solution().addBinary3("000", "000"));
        System.out.println(new Solution().addBinary2("11", "1"));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        int valA = Integer.parseInt(a, 2);
        int valB = Integer.parseInt(b, 2);
        return Integer.toString(valA + valB, 2);
    }

    public String strip(String str, char ch) {
        int pos = 0;
        while (pos < str.length() - 1 && str.charAt(pos) == ch) {
            ++pos;
        }
        return str.substring(pos);
    }
    public String addBinary2(String a, String b) {
       StringBuilder result = new StringBuilder();
       int posA = strip(a, '0').length() - 1, posB = strip(b, '0').length() - 1, prev = 0;

       while (posA >= 0 || posB >= 0) {
           int sum = prev;
           if (posA >= 0) { sum += a.charAt(posA--) - '0'; }
           if (posB >= 0) { sum += b.charAt(posB--) - '0'; }
           result.insert(0, sum % 2);
           prev = sum / 2;
       }
       if (prev > 0) { result.insert(0, prev); }
       return result.toString();
    }
    public String addBinary3(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
