package datastructure.linklist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hemants on 26/09/18.
 */

class NodeUtil {
    static void printNodeList(Node head) {
        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static int getValue(Node head, int at) {
        int currentIndex = 0;
        while (head.next != null) {
            if (currentIndex == at) {
                return head.data;
            }
            currentIndex++;

            head = head.next;
        }
        return 0;
    }

    static int getLength(Node head) {
        if (head == null)
            return 0;
        int length = 1;
        while (head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}

public class Node {

    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = new Node(data);
    }

    @Override
    public String toString(){
        Node head = this;
        StringBuffer sb = new StringBuffer();
        while(head != null){
            sb.append(head.data + " -> ");
            head = head.next;
        }
        return sb.toString();
    }


    public Node() {

    }

    @Test
    public void testNode() {
        Node head = new Node(1);

        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        NodeUtil.printNodeList(head);
        NodeUtil.printNodeList(head);
    }

    @Test
    public void testNodeLength() {
        Node head = new Node(1);

        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        System.out.println(NodeUtil.getLength(head));
        Assert.assertTrue(NodeUtil.getLength(head) == 4);
    }


}



