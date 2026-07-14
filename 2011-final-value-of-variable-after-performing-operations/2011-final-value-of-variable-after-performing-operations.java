class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("--X")) --ans;
            else if(arr[i].equals("X++")) ans++;
            else if(arr[i].equals("++X")) ++ans;
            else ans--;
        }

        return ans;
    }
}