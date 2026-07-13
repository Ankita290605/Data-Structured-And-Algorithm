class Solution {
    public boolean isValid(String s, int low, int high){
        int n = Integer.parseInt(s);
        if(n>=low && n<=high){
            return true;
        }
        return false;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String s = "123456789";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String str = s.substring(i, j+1);
                if(isValid(str, low, high)){
                    ans.add(Integer.parseInt(str));
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}