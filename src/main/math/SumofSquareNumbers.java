package main.math;

public class SumofSquareNumbers {

    public boolean judgeSquareSum(int c) {

        for (int i = 0; i * i <= c; i++) {
            int diff = c - i * i;
            double sr = Math.sqrt(diff);
            if (sr == Math.round(sr)) {
                return true;
            }
        }
        return false;
    }
}
