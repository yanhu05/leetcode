package main.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            boolean selfDividing = true;
            for (int j = 0; j < chars.length; j++) {
                int num = chars[j] - '0';
                if (num == 0 || i % num != 0) {
                    selfDividing = false;
                    break;
                }
            }
            if (selfDividing) {
                list.add(i);
            }
        }
        return list;
    }
}
