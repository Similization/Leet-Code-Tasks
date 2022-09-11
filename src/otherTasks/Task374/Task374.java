package otherTasks.Task374;

public class Task374 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.setNum(6);
        System.out.println(solution.guessNumber(10));
    }
}

class GuessGame {
    int num;

    public void setNum(int num) {
        this.num = num;
    }

    int guess(int num) {
        return Integer.compare(this.num, num);
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        while (left < n) {
            var mid = left + (n - left) / 2;
            switch (guess(mid)) {
                case 0 -> { return mid; }
                case 1 -> left = mid + 1;
                case -1 -> n = mid - 1;
            }
        }
        return left;
    }
}