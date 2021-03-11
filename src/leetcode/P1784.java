package leetcode;

public class P1784 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkOnesSegment("110"));
        System.out.println(solution.checkOnesSegment("1001"));
    }
    static class Solution {
        public boolean checkOnesSegment(String s) {
            for(int i = 0 ; i < s.length()-1; i++) {
                if(s.charAt(i) == '0' && s.charAt(i+1) == '1') {
                    return false;
                }
            }
            return true;
        }
    }
}
