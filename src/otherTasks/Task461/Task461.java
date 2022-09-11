package otherTasks.Task461;

public class Task461 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            count += ((x & 1) + (y & 1)) % 2;
            x >>= 1;
            y >>= 1;
        }
        return count;
    }

    public int hammingDistance2(int x, int y) {
        int xor = x ^ y, count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }

}