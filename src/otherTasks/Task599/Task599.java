package otherTasks.Task599;

import java.util.*;

public class Task599 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findRestaurant(
                new String[]{"happy", "sad", "good"},
                new String[]{"sad","happy","good"}
        )));
    }
}

class Solution {
    public Map<String, ArrayList<Integer>> addWordsFromList(Map<String, ArrayList<Integer>> map, String[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (map.containsKey(list[i])) {
                ArrayList<Integer> indexes = map.get(list[i]);
                indexes.add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                map.put(list[i], indexes);
            }
        }
        return map;
    }

    public String[] findRestaurant2(String[] list1, String[] list2) {
        Map<String, ArrayList<Integer>> wordIndexes = addWordsFromList(new HashMap<>(), list1);
        wordIndexes = addWordsFromList(wordIndexes, list2);
        List<String> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (var indexes : wordIndexes.entrySet()) {
            var indexList = indexes.getValue();
            if (indexList.size() > 1) {
                minDiff = Math.min(minDiff, indexList.get(0) + indexList.get(1));
            }
        }
        for (var indexes : wordIndexes.entrySet()) {
            var indexList = indexes.getValue();
            if (indexList.size() > 1 && indexList.get(0) + indexList.get(1) == minDiff) {
                result.add(indexes.getKey());
            }
        }
        return result.toArray(new String[0]);
    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> wordIndexes = new HashMap<>();
        for (int i = 0; i < list1.length; ++i) {
            wordIndexes.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; ++i) {
            String word = list2[i];
            if (wordIndexes.containsKey(word)) {
                if (i + wordIndexes.get(word) == minDiff) {
                    result.add(word);
                } else if (i + wordIndexes.get(word) < minDiff) {
                    result.clear();
                    result.add(word);
                    minDiff = i + wordIndexes.get(word);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}