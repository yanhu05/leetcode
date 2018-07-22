package main.math;

/*
https://leetcode.com/problems/excel-sheet-column-number/description/
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int[] letters = new int[26];
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            letters[c - 'A'] = i;
            c++;
        }

        int len = s.length();
        int pow = 1;
        int sum = 0;
        for (int i = len - 2; i >= 0; i--) {
            char myChar = s.charAt(i);
            double tmp = Math.pow(26, pow);
            sum += tmp * letters[myChar - 'A'];
            pow++;
        }
        return sum + letters[s.charAt(len - 1) - 'A'];
    }
}
