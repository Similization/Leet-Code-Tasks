package otherTasks.Task541;

public class Task541 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseStr("abcdefgh", 3));
    }
}

class Solution {
    public String reverseStr2(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int step = 0;
        boolean isReversed = true;
        for (int i = 0; i < s.length(); ++i) {
            if (isReversed) {
                sb.insert(i - step, s.charAt(i));
                step++;
                isReversed = step < k;
            } else {
                sb.append(s.charAt(i));
                step--;
                isReversed = step <= 0;
            }
        }
        return sb.toString();
    }
}
