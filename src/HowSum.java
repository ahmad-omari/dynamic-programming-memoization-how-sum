import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/21/2022, Friday
 * @project : dynamic-programming-memoization-how-sum
 **/
public class HowSum {

    public static Integer[] howSum(Integer targetSum, Integer[] numbers, Map<Integer, Integer[]> memo){
        if (memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new Integer[]{};
        }
        if (targetSum < 0){
            return null;
        }
        for (Integer num : numbers) {
            int reminder = targetSum - num;
            Integer[] howSums = howSum(reminder, numbers, memo);
            if (howSums != null) {
                List<Integer> collect = Arrays.stream(howSums).collect(Collectors.toList());
                collect.add(num);
                memo.put(targetSum, collect.toArray(new Integer[]{}));
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, null);
        return null;
    }

    public static void print(Integer [] arr){
        if (arr == null){
            return;
        }
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(howSum(7, new Integer[]{2, 3}, new HashMap<>())); // [3, 2, 2]
        print(howSum(7, new Integer[]{5, 3, 4, 7}, new HashMap<>())); // [4, 3]
        print(howSum(7, new Integer[]{2, 4}, new HashMap<>())); // null
        print(howSum(8, new Integer[]{2, 3, 5}, new HashMap<>())); // [2, 2, 2, 2]
        print(howSum(300, new Integer[]{7, 14}, new HashMap<>())); // null
    }
}
