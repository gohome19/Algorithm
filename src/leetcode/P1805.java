package leetcode;

import java.util.HashSet;

public class P1805 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numDifferentIntegers("a1b01c001");
        solution.numDifferentIntegers("leet1234code234");

    }
    public static class Solution {
        public void add(StringBuilder builder, HashSet<String> hashSet) {
            if (builder.toString().length() != 0) {
                int end_zero = 0;
                while(end_zero < builder.length() && builder.charAt(end_zero) == '0') {
                    end_zero++;
                }
                builder.delete(0, end_zero);
                hashSet.add(builder.toString());
                builder.delete(0, builder.length());
            }
        }
        public int numDifferentIntegers(String word) {
            HashSet<String> hashSet = new HashSet<>();

            StringBuilder builder = new StringBuilder();
            boolean isBuffer = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (c >= '0' && c <= '9') {
                    builder.append(c);
                    isBuffer = true;
                }
                else isBuffer = false;

                if (!isBuffer) add(builder, hashSet);

            }
            if (isBuffer) add(builder, hashSet);
            System.out.println(hashSet.size());
            return hashSet.size();
        }
    }
}
