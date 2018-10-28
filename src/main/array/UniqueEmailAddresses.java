package main.array;
/*

https://leetcode.com/problems/unique-email-addresses/description/

 */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        if (emails == null) return 0;
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '@' || c == '+') {
                    break;
                }
                if (c != '.') {
                    sb.append(c);
                }

            }
            String domain = email.substring(email.indexOf("@"));
            sb.append("@");
            sb.append(domain);
            set.add(sb.toString());
        }
        return set.size();
    }
}
