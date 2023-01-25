package com.dsa.day_1;


import java.util.*;
public class LongestSubstringWithAtLeastKrepeatingCharacters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        int max = longestSubstring(s,k);
        System.out.println(max);
    }
    
   static public int longestSubstring(String s, int k) {
    int maxLen = 0;
    for (int i = 1; i <= 26; i++) {
        int[] counts = new int[26];
        int unique = 0;
        int noLessThanK = 0;
        int start = 0;
        for (int j = 0; j < s.length(); j++) {
            int idx = s.charAt(j) - 'a';
            if (counts[idx] == 0) {
                unique++;
            }
            counts[idx]++;
            if (counts[idx] == k) {
                noLessThanK++;
            }
            while (unique > i) {
                int leftIdx = s.charAt(start) - 'a';
                if (counts[leftIdx] == k) {
                    noLessThanK--;
                }
                counts[leftIdx]--;
                if (counts[leftIdx] == 0) {
                    unique--;
                }
                start++;
            }
            if (unique == i && unique == noLessThanK) {
                maxLen = Math.max(maxLen, j - start + 1);
            }
        }
    }
    return maxLen;
}

}