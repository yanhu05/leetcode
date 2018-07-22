package main.array;

public class TwoSumSorted {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0, j = numbers.length - 1; i < j; ) {
            int sum = numbers[j] + numbers[i];
            if (sum == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}

