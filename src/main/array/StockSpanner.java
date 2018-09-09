package main.array;

/*

https://leetcode.com/problems/online-stock-span/description/

 */

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
    List<Integer> list = new ArrayList<>();
    List<Integer> memo = new ArrayList<>();

    public StockSpanner() {
    }

    public int next(int price) {
        list.add(price);
        int cnt = 1;
        int lastIndex = list.size() - 1;
        while (lastIndex > 0) {
            if (price >= list.get(lastIndex - 1)) {
                int prv = memo.get(lastIndex - 1);
                cnt += prv;
                lastIndex = lastIndex - prv;
                continue;
            }
            break;
        }
        memo.add(cnt);
        return cnt;
    }
}
