/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node temp = head;
         int n =0;
         while(temp!=null){
             n+=1;
             temp = temp.next;
         }
         int count =0;
         while(count < (n/2)){
             count+=1;
             head= head.next;
         }
         
         return head.data;
    }
}
