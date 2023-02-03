package com.dsa.day_7;


class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}

class Solution{
  public static Node addAtHead(Node head,int data){
    //write your code here.
    if(head==null){
            Node new_node = new Node(data);
            return new_node;
        }
        Node current = new Node(data,head);
     
        // current.next = head;

        head = current;
        return head;
  }
}

public class InsertNodeAtTheHead {

}
