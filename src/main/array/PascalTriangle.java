package main.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) return list;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        list.add(tmp);
        if (numRows == 1) return list;
        tmp = new ArrayList<>();
        tmp.add(1);
        tmp.add(1);
        list.add(tmp);

        for (int i = 3; i <= numRows; i++) {
            List<Integer> thisList = new ArrayList<>();
            thisList.add(1);
            for (int j = 0; j < tmp.size() - 1; j++) {
                int sum = tmp.get(j) + tmp.get(j + 1);
                thisList.add(sum);
            }
            thisList.add(1);
            list.add(thisList);
            tmp = thisList;
        }

        return list;
    }
}
