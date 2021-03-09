package baekjun;

import java.util.Scanner;

/*
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 */

public class P15649 {
    static int n;
    static int maxDepth;
    static boolean[] visited ;
    static int[] cur;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        maxDepth = sc.nextInt();
        visited = new boolean[n+1];
        cur = new int[maxDepth];
        perm(0);
    }

    public static void perm(int depth) {
        if (depth == maxDepth) {
            for (int i = 0; i < cur.length; i++) {
                System.out.print(cur[i] + " ");
            }
            System.out.println();
            return;
        } else {
            for(int i = 1 ; i <= n; i++ ) {
                if (!visited[i]) {
                    visited[i] = true;
                    cur[depth] = i;
                    perm(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
