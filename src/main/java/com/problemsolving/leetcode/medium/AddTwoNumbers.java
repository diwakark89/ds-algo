package com.problemsolving.leetcode.medium;


/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
   You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

public class AddTwoNumbers {
    public static void main(String []args){

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0,d1,d2;
        ListNode head=new ListNode(0),temp=null;
        ListNode ans=head;
        while(l1 != null || l2 != null ||c>0){
            if(l1!=null){
                d1=l1.val;
                l1=l1.next;
            }else{
                d1=0;
            }
            if(l2!=null){
                d2=l2.val;
                l2=l2.next;
            }else{
                d2=0;
            }
            temp=new ListNode((d1+d2+c)%10);
            ans.next=temp;
            ans=ans.next;
            c=(d1+d2+c)/10;
        }
        return head.next;
    }

}
class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
