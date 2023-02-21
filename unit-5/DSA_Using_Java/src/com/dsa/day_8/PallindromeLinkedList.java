package com.dsa.day_8;

import java.util.ArrayList;
import java.util.List;

public class PallindromeLinkedList {

}


  class Node{ int data; Node next;
 
  public Node(int data,Node next){ this.data = data; this.next = next; } public
  Node(int data){ this.data = data; this.next = null; } public Node(){
  this.data = 0; this.next = null; } }
 
class Solution {
	public static boolean detectPalindrome(Node a) {
		Node node1 = a;
		List<Integer> list = new ArrayList<>();
		while (node1 != null) {
			list.add(node1.data);
			node1 = node1.next;
		}

		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			if (list.get(i) != list.get(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}