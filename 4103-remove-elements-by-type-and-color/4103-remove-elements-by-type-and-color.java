class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {

        Stack<int[]> st = new Stack<>();

        for (int i = 0; i < types.length; i++) {

            int type = types[i];
            int color = colors[i];

            if (!st.isEmpty() && st.peek()[0] == type && st.peek()[1] == color) {

                st.peek()[2]++;

            } 
            else {
                st.push(new int[]{type, color, 1});
            }

            if (st.peek()[2] == groupSize[type]) {
                st.pop();
            }
        }

        return st.isEmpty();
    }
}
