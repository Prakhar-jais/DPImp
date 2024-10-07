package com.company;
import java.util.Scanner;

public class Buy_And_Sell_Stock_2 {

    //you can buy and sell multiple times but can only
    // buy again if already sell previously buy stock and thus maximize the profit

    public static int sol(int ind,int Buy,int n,int arr[]){

        if(ind>=n){
            return 0;
        }
        int profit = 0;
        if(Buy==1){
            profit = Math.max(-arr[ind]+sol(ind+1,0,n,arr),0+sol(ind+1,1,n,arr));
        }
        else{
            profit = Math.max(arr[ind]+sol(ind+1,1,n,arr),0+sol(ind+1,0,n,arr));
        }

        return profit;
    }
    public static int B_A_SS2(int n,int arr[]){

        int ans = sol(0,1,n,arr);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len = sc.nextInt();
        int a[] = new int[len];
        for(int i=0;i<len;i++){

            a[i] = sc.nextInt();

        }

        int ans = B_A_SS2(len,a);
        System.out.println(ans);

    }
}
