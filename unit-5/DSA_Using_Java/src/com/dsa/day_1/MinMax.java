package com.dsa.day_1;

import java.util.*;
class MinMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            minMax(arr,n,stack);
        }
    }
    static void minMax(int[] arr,int n,Stack<Integer> stack){
        
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                stack.push(i);
            }
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                stack.push(i);
            }
        }
        // System.out.println(stack);
        int min = Integer.MAX_VALUE;
        
        if(stack.size() == 0 || stack.size()==1){
            System.out.println("-1 -1");
            return;
        }else if(stack.size() == 2){
            System.out.println(stack.get(1)-stack.get(0)+" "+(stack.get(1)-stack.get(0)));
            return;
        }else{
            for(int i=1;i<stack.size();i++){
                if(stack.get(i)-stack.get(i-1) < min){
                    min =  stack.get(i)-stack.get(i-1);
                }
            }
            System.out.println(min+" "+(stack.get(stack.size()-1)-stack.get(0)));
            return;
        }
    }
}