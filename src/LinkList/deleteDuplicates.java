package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return head;

        ListNode l1 = head;
        while(l1.next!=null){
            if(l1.val==l1.next.val){
                l1.next = l1.next.next;
            }else{
                l1 = l1.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        deleteDuplicates deleteDuplicates = new deleteDuplicates();
//        deleteDuplicates.deleteDuplicates(list);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
