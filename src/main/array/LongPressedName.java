package main.array;

/*

https://leetcode.com/problems/long-pressed-name/description/

 */
public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        int pos = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (pos < typed.length() && c == typed.charAt(pos)) {
                pos++;
                continue;
            }

            while (pos > 0 && pos < typed.length() && typed.charAt(pos - 1) == typed.charAt(pos)) {
                pos++;
            }
            if (pos >= typed.length() || c != typed.charAt(pos)) {
                return false;
            }
            pos++;
        }
        while (pos < typed.length()) {
            if (typed.charAt(pos - 1) != typed.charAt(pos)) {
                return false;
            }
            pos++;
        }
        return true;
    }
}
