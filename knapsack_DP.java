package com.company;

import java.util.Scanner;

public class knapsack_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nOE = sc.nextInt();
        int []runs = new int[nOE];
        int []rInHMBalls = new int[nOE];
        for(int i=0;i<nOE;i++){
            runs[i] = sc.nextInt();

        }
        for(int i=0;i<nOE;i++){
            rInHMBalls[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        int [][]dp = new int[nOE+1][target+1];
        for(int i=1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
               if(j>=rInHMBalls[i-1]){
                   dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-rInHMBalls[i-1]]+runs[i-1]);
               }
               else{
                   dp[i][j] = dp[i-1][j];
               }

            }
        }
        System.out.println(dp[nOE][target]);

    }
}
