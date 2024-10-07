package com.company;

public class variablejumps {
    public static int varJump(int arr[],int dp[])
    {
        dp[arr.length] = 1 ;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == 0)
            {
                dp[i] = 0 ;
            }
            else{
                for(int j=1;j<=arr[i] && i+j<dp.length;j++)
                {

                    dp[i] += dp[i+j] ;
                }
            }


        }
        return dp[0];
    }
    public static void main(String[] args) {

        int arr[] = {3,3,0,2,2,3};
        int dp[] = new int[arr.length+1];
        int ans = varJump(arr,dp);
        System.out.println(ans);

    }
}
