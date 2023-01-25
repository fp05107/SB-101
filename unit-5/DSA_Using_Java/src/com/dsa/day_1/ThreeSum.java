package com.dsa.day_1;

import java.util.*;
import java.io.*;
public class ThreeSum{
    static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  public static void main(String[] args){
     FastReader sc = new FastReader();
     
      int tc = sc.nextInt();
      while(tc-- > 0){
          int n = sc.nextInt();
          int[] nums = new int[n];
          for(int i=0;i<n;i++){
              nums[i] = sc.nextInt();
          }
          List<List<Integer>> list = threeSum(nums);
          System.out.println(list.size());
          for(int i=0;i<list.size();i++){
              StringBuilder sb = new StringBuilder();
              for(int j=0;j<list.get(i).size();j++){
                  sb.append(list.get(i).get(j)+" ");
              }
              System.out.println(sb);
          }
      }
     
  }
  
  
    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        
        int i = 0;
        
        while(i < nums.length - 2) {
            if(nums[i] > 0) {
                break;
            }    
            
            int j = i + 1;
            int k = nums.length - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                if(sum <= 0){
                   while(nums[j] == nums[++j] && j < k){
                       
                   } 
                } 
                if(sum >= 0){
                   while(nums[k--] == nums[k] && j < k){
                       
                   } 
                }
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }
  
}