package main.string;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {
        if (S == null) return "";
        char[] chars = S.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (Character.isLetter(chars[start]) && Character.isLetter(chars[end])) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                start++;
                end--;
                continue;
            }

            if (!Character.isLetter(chars[start])) {
                start++;
            }
            if (!Character.isLetter(chars[end])) {
                end--;
            }
        }

        return String.valueOf(chars);
    }
}
