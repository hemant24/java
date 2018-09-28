package problemsolving.crackingthecodinginterview;

import datastructure.linklist.Node;

import java.util.HashSet;

/**
 * Created by hemants on 28/09/18.
 */
public class RemoveDups2 {

    public static void removeDup(Node n){
        Node previous = null;
        HashSet set = new HashSet();

        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }else{
                set.add(n.data);
                previous = n;
            }

            n = n.next;
        }


    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(4);
        removeDup(head);
        System.out.println(head);
    }
}
