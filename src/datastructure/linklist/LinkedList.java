package datastructure.linklist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hemants on 26/09/18.
 */


public class LinkedList {
    int length;
    ListNode head;

    //gethead
    public ListNode getHead(){
        return head;
    }
    //insertAtBegin
    public void insertAtBegin(int data){
        if(head == null){
            head = new ListNode(data);
        }else{
            ListNode node = new ListNode(data);
            node.next = head;
            head = node;
        }
        length++;

    }


    //insertAtEnd
    public void insertAtEnd(int data){
        if(head == null){
            head = new ListNode(data);
        }else {
            /*
                My implementation

            ListNode node = head;
            for (int i = 1; i < length; i++) {
                node = node.next;
            }
            node.next = new ListNode(data);
            */
            //From book
            ListNode p,q;
            for(p = head; (q = p.next)!= null; p = q);
            p.next = new ListNode(data);

        }
        length++;
    }
    //insert(data, position)
    public void insert(int data, int position){
        if(position < 0 || position > length){
            throw new RuntimeException("Invalid postion");
        }
        if(position == 0){
            insertAtBegin(data);
            return;
        }
        if(position == length){
            insertAtEnd(data);
            return;
        }
        ListNode previousNode = head;
        for(int i = 0 ; i < position-1 ; i++){
            previousNode = previousNode.next;
        }
        ListNode newNode = new ListNode(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        /*
        ListNode nextNode = previousNode.next;
        previousNode.next = insertedNode;
        insertedNode.next = nextNode;
        */
        length++;

    }
    //removeFromBegin
    public void removeFromBegin(){
        if(head == null){
            return;
        }
        head = head.next;
        length--;
    }
    //removeFromEnd
    public void removeFromEnd(){
        if(head == null){
            return;
        }
        ListNode previousNode = head;
        for(int i = 1; i< length - 1; i++){
            previousNode = previousNode.next;
        }
        previousNode.next = null;
        length--;
    }
    //remove(position)
    public void remove(int position){
        if(head == null){
            return;
        }
        if(position == 0){
            removeFromBegin();
            return;
        }
        if(position == length-1){
            removeFromEnd();
            return;
        }
        ListNode previousNode = head;
        for(int i = 1; i < position ; i++){
            previousNode = previousNode.next;
        }
        //ListNode nextNode = previousNode.next;
        previousNode.next = previousNode.next.next;
        length--;
    }
    //length
    public int length(){
        return length;
    }
    //toString
    @Override
    public String toString(){
        ListNode node = head;
        if(node == null){
            return "";
        }else{
            while(node.next != null){
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println(node.data);
        }
        return "";
    }
    //int getPosition(position)


    @Test
    public void testLinkedList(){
        LinkedList ll = new LinkedList();
        ll.insertAtBegin(2);
        ll.insertAtBegin(3);
        ll.insertAtBegin(15);
        System.out.println(ll);
        ll.insertAtBegin(20);
        System.out.println(ll);
        System.out.println("length is " + ll.length());
    }

    @Test
    public void testLinkedListInsertAtEnd(){
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        System.out.println(ll);
        ll.insertAtEnd(8);
        System.out.println(ll);
        Assert.assertTrue(ll.length() == 3);
    }

    @Test
    public void testLinkedListInsertAtIndex(){
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(18);
        System.out.println(ll);
        ll.insert(10, 2);
        System.out.println(ll);
        System.out.println(ll.getHead().data);
        Assert.assertTrue(ll.length() == 5);
    }

    @Test
    public void testLinkedListRemoveFromBegin(){
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(18);

        ll.removeFromBegin();
        ll.removeFromBegin();

        Assert.assertTrue(ll.getHead().data == 8);
        Assert.assertTrue(ll.length() == 2);
    }

    @Test
    public void testLinkedListRemoveFromEnd(){
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(18);

        ll.removeFromEnd();
        ll.removeFromEnd();

        System.out.println(ll);
        Assert.assertTrue(ll.getHead().data == 2);

        Assert.assertTrue(ll.length() == 2);
    }

    @Test
    public void testLinkedListRemoveAt(){
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(18);

        ll.remove(1);
        ll.remove(0);
        System.out.println(ll);


        Assert.assertTrue(ll.length() == 2);
    }
}
