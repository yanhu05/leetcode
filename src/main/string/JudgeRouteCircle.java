package main.string;

public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        if (moves == null && moves.length() == 0) return true;
        int numUp = 0;
        int numDn = 0;
        int numLeft = 0;
        int numRight = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                numUp++;
            } else if (c == 'D') {
                numDn++;
            } else if (c == 'L') {
                numLeft++;
            } else {
                numRight++;
            }
        }
        return numUp == numDn && numLeft == numRight;
    }
}
