package problemsolving.crackingthecodinginterview;

import datastructure.linklist.LinkedList;
import datastructure.linklist.ListNode;

/**
 * Created by hemants on 26/09/18.
 */

public class RemoveDups {

    private boolean contains(int[] arr, int a){
        for(int i : arr){
            if(i == a)
                return true;
        }
        return false;
    }

    public void removeDuplicates(LinkedList ll){
        int[] alreadyContains = new int[ll.length()];
        ListNode head = ll.getHead();
        int i = 0;
        while(head.next != null){
            if(contains(alreadyContains, head.data)){
                ll.remove(i);
                i--;
            }else {
                alreadyContains[i] = head.data;
            }
            i++;
            head = head.next;
        }
        if(contains(alreadyContains, head.data)){
            ll.remove(i);
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(4);
        new RemoveDups().removeDuplicates(ll);
        System.out.println(ll);
    }
}
