package main.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsSpecialEquivalentStrings {

    public int numSpecialEquivGroups(String[] A) {

        Set<String> seen = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            seen.add(getSortedString(A[i]));
        }
        return seen.size();
    }


    private String getSortedString(String a) {
        if (a.length() == 0 || a.length() == 1) return a;
        int size = a.length() / 2;
        char[] odd;
        char[] even;
        if (a.length() % 2 == 0) {
            odd = new char[size];
            even = new char[size];
        } else {
            odd = new char[size];
            even = new char[size + 1];
        }
        int k = 0;
        int j = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (i % 2 == 0) {
                even[k++] = c;
            } else {
                odd[j++] = c;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        return new StringBuilder().append(odd).append(even).toString();
    }
}
