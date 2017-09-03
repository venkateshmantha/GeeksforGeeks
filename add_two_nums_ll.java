/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG
{
	Node addTwoLists(Node first, Node second)
	{
	   Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;
 
        while (first != null || second != null) //while both lists exist
        {
        
            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);
 
            carry = (sum >= 10) ? 1 : 0;
 
            sum = sum % 10;
            temp = new Node(sum);
 
    
            if (res == null) {
                res = temp;
            } else 
            {
                prev.next = temp;
            }
            prev = temp;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
 
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
	}
}