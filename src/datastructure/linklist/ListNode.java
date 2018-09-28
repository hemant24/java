package datastructure.linklist;

/**
 * Created by hemants on 26/09/18.
 */
public class ListNode {
    public ListNode next;
    public int data;

    ListNode(int data) {
        this.data = data;
    }

    void appendToTail(int d){
        ListNode node = this;
        ListNode newNode = new ListNode(d);
        while(node.next != null){
            node = node.next;
        }
        node.next = newNode;
    }

}
