package leetcode;

public class P1785 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minElements(new int[]{1, -1, 1}, 3, -4));
    }
    static class Solution {
        public int minElements(int[] nums, int limit, int goal) {
            long sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            long target = Math.abs(goal - sum);
            long v = target / limit;
            if (target%limit != 0) v++;
            return (int)v;
        }
    }
}
