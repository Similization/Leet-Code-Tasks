package InterviewQuestions.Task22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task22 {
    public static void main(String[] args) {

    }
}

// 1 variant, gives 2 variants
//ab 10 2 -> (()), ()()

// 2 variants, give 5 variants
//aabb 1100 12 -> ((())), ()(()), (())()

//abab 1010 10 -> (()()), ()()(), ()()()

// 5 variants, gives 13 variants
//aaabbb 111000 56 ((())) -> (((()))), ()((())), ((()))()

//aababb 110100 52 (()()) -> ((()())), ()(()()), (()())()
//aabbab 110010 50 (())() -> ((())()), ()(())(), (())()()

//abaabb 101100 44 ()(()) -> (()(())), ()()(()), ()(())()
//ababab 101010 42 ()()() -> (()()()), ()()()(), ()()()()

// 14 variants
//aaaabbbb 11110000 (((())))

//aaababbb 11101000 ((()()))
//aaabbabb 11100100 ((())())
//aaabbbab 11100010 ((()))()

//aabaabbb 11011000 (()(()))
//aabababb 11010100 (()()())
//aababbab 11010010 (()())()
//aabbaabb 11001100 (())(())
//aabbabab 11001010 (())()()

//abaaabbb 10111000 ()((()))
//abaababb 10110100 ()(()())
//abaabbab 10110010 ()(())()
//ababaabb 10101100 ()()(())
//abababab 10101010 ()()()()


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>(2 * n);
        int pos = 0;
        for (;pos < 2 * n; ++pos) {
            if (pos < n) {
                characters.add('(');
            } else {
                characters.add(')');
            }
        }
        pos = n;

        return list;
    }
}
