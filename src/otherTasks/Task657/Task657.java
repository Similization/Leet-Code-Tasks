package otherTasks.Task657;

public class Task657 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean judgeCircle(String moves) {
        int udSum = 0, lrSum = 0;
        for (var ch : moves.toCharArray()) {
            switch (ch) {
                case 'L' -> --lrSum;
                case 'R' -> ++lrSum;
                case 'U' -> --udSum;
                case 'D' -> ++udSum;
            }
        }
        return udSum == 0 && lrSum == 0;
    }
}
