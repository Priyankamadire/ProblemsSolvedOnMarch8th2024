/*
Problem statement
You are given a Singly Linked List of ‘N’ positive integers. Your task is to add a node having the value ‘VAL’ at position ‘POS’ in the linked list.

Note:
Assume that the Indexing for the linked list starts from 0.
EXAMPLE:
Input: ‘N’ = 5, 'LIST' = [1, 1, 2, 3, 4, -1], ‘VAL’ = 2, ‘POS’ = 1.

Output: 1 -> 2 -> 1 -> 2 -> 3 -> 4 

Here in the given list we can see that the node having value 2 is inserted at position 1.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= ‘T’ <= 10 
1 <= ‘N’ <= 10^4 
0 <= ‘POS <= N  
1 <= ‘data’, 'VAL' <= 10^7

Where 'N' is the size of the singly linked list, and ‘data’ is the Integer data of the singly linked list.

Time Limit: 1 sec
Sample Input 1 :
2
5
1 1 2 3 4 -1
2 1
1
1 -1
3 1
Sample Output 1 :
1 2 1 2 3 4
1 3
Explanation Of Sample Input 1 :
For the first test case,
‘N’ = 5, 'LIST' = [1, 1, 2, 3, 4, -1], ‘VAL’ = 2, ‘POS’ = 1.
After inserting the node having value = 2 at position 1 the list will be:
1 -> 2 -> 1 -> 2 -> 3 -> 4.

For the second test case,
‘N’ = 1,  'LIST' = [1, -1], ‘VAL’ = 3, ‘POS’ = 1.
After inserting the node having value = 3 at position 1 the list will be:
1 -> 3.
Sample Input 2 :
2
2
1 2 -1
3 0
2
3 4 -1
5 1
Sample Output 2 :
3 1 2  
3 5 4
 */
//Insertion In A Singly Linked List coding ninja
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class InsertBeforek {
    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node nn = new Node(val);
        if (pos == 0) {
            nn.next = head;
            head = nn;
            return head;
        }
        Node prev = head;
        Node cur = head;
        for (int i = 0; i < pos; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = nn;
        nn.next = cur;
        return head;

    }

}
