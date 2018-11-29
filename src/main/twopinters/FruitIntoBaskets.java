package main.twopinters;

public class FruitIntoBaskets {

    public int totalFruit(int[] tree) {
        if (tree == null) return 0;
        int max = 1;
        int slow = 0;
        int fast = 1;
        while (fast < tree.length) {
            int first = tree[slow];
            int second = tree[fast];
            int ans = 2;
            while (slow > 0 && tree[slow] == tree[slow - 1]) {
                ans++;
                slow--;
            }
            while (fast < tree.length - 1 && first == second) {
                ans++;
                second = tree[++fast];
            }
            fast++;
            while (fast < tree.length && (tree[fast] == first || tree[fast] == second)) {
                ans++;
                fast++;
            }
            max = Math.max(max, ans);
            slow = fast - 1;
        }
        return max;
    }

    public int totalFruitTLE(int[] tree) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tree.length; i++) {
            int first = tree[i];
            int second = -1;
            int total = 1;
            for (int j = i + 1; j < tree.length; j++) {
                if (tree[j] == first || tree[j] == second) {
                    total++;
                    continue;
                }
                if (second == -1) {
                    second = tree[j];
                    total++;
                    continue;
                }

                break;


            }
            max = Math.max(max, total);

        }

        return max;
    }
}
