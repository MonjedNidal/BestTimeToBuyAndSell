package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2}));
    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0],profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]){
                buy = prices[i];
            }else if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }return profit;
    }
}
