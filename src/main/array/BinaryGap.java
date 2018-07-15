package main.array;

public class BinaryGap {

    public int binaryGap(int N) {

        String s = Integer.toBinaryString(N);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                for (int j = i + 1; j < s.length(); j++) {
                    char _c = s.charAt(j);
                    if (_c != '1') continue;
                    int distance = j - i;
                    max = Math.max(max, distance);
                    break;
                }

            }
        }
        return max;
    }
}
