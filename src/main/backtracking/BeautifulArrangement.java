package main.backtracking;

/*

https://leetcode.com/problems/beautiful-arrangement/description/

 */
public class BeautifulArrangement {

    int count = 0;
    int number = 0;

    public int countArrangement(int num) {
        this.number = num;
        boolean[] visited = new boolean[num + 1];
        backtrack(1, 1, visited);
        return count;
    }

    private void backtrack(int num, int level, boolean[] visited) {
        if (num % level != 0 && level % num != 0) {
            return;
        }
        if (level == this.number) {
            this.count++;
            return;
        }
        for (int i = 1; i <= this.number; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(i, level + 1, visited);
                visited[i] = false;
            }
        }
    }
}
