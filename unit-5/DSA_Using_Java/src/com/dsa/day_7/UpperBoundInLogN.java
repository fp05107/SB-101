package com.dsa.day_7;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        upperBound(arr,n,k);
        
    }
    static void upperBound(int[] arr,int n,int k){
        int left = 0;
        int right = n-1;
        int ans = -1;
        while(left<=right){
            int mid = (int)Math.floor((right+left)/2);
            
            if(arr[mid]==k){
                
               left = mid+1;
            }
            else if(arr[mid]<k){
                left = mid+1;
            }
            else{
                right = mid-1;
                
            }
        }
        ans =  right+1;
        System.out.println(ans);
        // return -1;
        
    }
}
public class UpperBoundInLogN {

}
