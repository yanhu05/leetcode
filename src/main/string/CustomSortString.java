package main.string;

/*


https://leetcode.com/problems/custom-sort-string/description/

 */
public class CustomSortString {

    public String customSortString(String S, String T) {
        if (S == null || S.length() == 0) return "";
        boolean[] used = new boolean[T.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); ++i) {
            char c = S.charAt(i);
            // use a map to store chars in T so that we do not have to repeatedly scan T
            for (int j = 0; j < T.length(); j++) {
                char _c = T.charAt(j);
                if (c == _c && !used[j]) {
                    used[j] = true;
                    sb.append(c);
                }
            }
        }
        for (int j = 0; j < T.length(); j++) {
            char c = T.charAt(j);
            if (!used[j]) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
