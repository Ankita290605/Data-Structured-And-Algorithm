import java.util.*;

class Solution {

    class Points {
        int x;
        int y;
        int dist;

        Points(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }
    }

    public int[][] kClosest(int[][] nums, int k) {

        PriorityQueue<Points> pq = new PriorityQueue<>(
            (a, b) -> a.dist - b.dist
        );

        // Add all points to min heap
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Points(nums[i][0], nums[i][1]));
        }

        int[][] ans = new int[k][2];

        // Extract k closest points
        for (int i = 0; i < k; i++) {
            Points p = pq.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}