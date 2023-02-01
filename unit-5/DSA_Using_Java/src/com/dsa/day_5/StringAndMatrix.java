package com.dsa.day_5;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] arr = new char[n][m];
            for(int i=0;i<n;i++){
                String s = sc.next();
                for(int j=0;j<m;j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            
            String str = sc.next();
            
            boolean t = stringAndMatrix(n,m,arr,str);
            if(t){
                System.out.println("Yes");
            }else{
                System.out.println("No");
                
            }
            
        }
    }
    static boolean stringAndMatrix(int n,int m,char[][] arr,String str){
        
        int i = 0;
        int j = 0;
        while(i<str.length()){
            boolean f = false;
            if(j == n){
                j = 0;
            }
            for(int k=0;k<m;k++){
                if(str.charAt(i) == arr[j][k]){
                    arr[j][k] = '1';
                    i++;
                    j++;
                    f = true;
                    break;
                }
            }
            if(!f){
                return false;
            }
        }
        return true;

    }
}

public class StringAndMatrix {

}
