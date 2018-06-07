package main.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BeautifulArrangement {

    int count = 0;

    public int countArrangement(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        for (int i = 1; i <= num; i++) {
            final int tmp = i;
            List<Integer> r = list.stream().filter(myNum -> myNum != tmp).collect(Collectors.toList());
            backtrack(i, 1, r);
        }
        return count;
    }

    private void backtrack(int num, int index, List<Integer> remaining) {
        if (num % index != 0 && index % num != 0) {
            return;
        }
        if (remaining.size() == 0) {
            this.count++;
            return;
        }
        for (Integer integer : remaining) {
            List<Integer> r = remaining.stream().filter(myNum -> myNum != integer).collect(Collectors.toList());
            backtrack(integer, index + 1, r);
        }
    }
}
