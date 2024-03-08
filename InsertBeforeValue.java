/*Problem statement
You are given the 'head' of a singly linked list with unique integer elements.



Also, two integers 'x' and 'val' are provided.



Your task is to insert a node with value 'x' immediately before the node with value 'val' in the linked list.



Note:
The linked list is guaranteed to always contain a node with the value 'val'.


Example:
Input:
Linked List: 1 -> 3 -> 5 -> 7
x: 4
val: 5
Output:
1 -> 3 -> 4 -> 5 -> 7

Explanation:
In the provided linked list, we insert '4' immediately before '5'.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
1 2 3 4 5
9
4
Sample Output 1:
1 2 3 9 4 5
Explanation Of Sample Input 1 :
In the provided linked list, we insert '9' immediately before '4', resulting in the list 1 -> 2 -> 3 -> 9 -> 4 -> 5.


Sample Input 2:
4
10 20 30 40
25
30
Sample Output 2:
10 20 25 30 40
Explanation Of Sample Input 2 :
In the provided linked list, we insert '25' immediately before '30', resulting in the list 10 -> 20 -> 25 -> 30 -> 40.


Expected Complexity:
Time Complexity: O(n)
Space Complexity: O(1)


Constraints:
1 <= 'n' <= 10^4
1 <= 'x', 'val', linked list node values <= 10^4
The linked list is guaranteed to contain a node with the value 'val'.*/
class Node
 {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }
public class InsertBeforeValue {
    public static Node insertBeforeValue(Node head, int x, int val) {
        // Write Your Code Here.
        if(head.data==val){
            return new Node(x,head);
        }
        Node temp = head;
        while(temp.next.data!=val){
            temp=temp.next;
        }
        temp.next=new Node(x,temp.next);
        return head;
    }
}