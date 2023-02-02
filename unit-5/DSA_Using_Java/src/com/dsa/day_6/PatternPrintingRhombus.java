package com.dsa.day_6;
import java.util.*;

class Main3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n = n+1;
    
    // first half of the pattern
    for (int i = 0; i < n; i++) {
      // print spaces
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      // print numbers
      for (int j = 0; j <= i; j++) {
        System.out.print(j + " ");
      }
      for (int j = i - 1; j >= 0; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    // second half of the pattern
    for (int i = n - 2; i >= 0; i--) {
      // print spaces
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("  ");
      }
      // print numbers
      for (int j = 0; j <= i; j++) {
        System.out.print(j + " ");
      }
      for (int j = i - 1; j >= 0; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}

public class PatternPrintingRhombus {

}
