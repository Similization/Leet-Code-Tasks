package otherTasks.Task118;

import java.util.ArrayList;
import java.util.List;

public class Task118 {
    public static void main(String[] args) {
        System.out.println(new Solution().generate(1));
        System.out.println(new Solution().generate(2));
        System.out.println(new Solution().generate(3));
        System.out.println(new Solution().generate(4));
        System.out.println(new Solution().generate2(5));
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; ++i) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(1);
            while (list.size() < i) {
                list.add(lists.get(i - 1).get(list.size() - 1) + lists.get(i - 1).get(list.size()));
            }
            if (list.size() == i) {
                list.add(1);
            }
            lists.add(list);
        }
        return lists;
    }
    public List<List<Integer>> generate2(int numRows)
    {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allRows.add(new ArrayList<Integer>(row));
        }
        return allRows;

    }
}
