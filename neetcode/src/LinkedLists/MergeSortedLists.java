package LinkedLists;

public class MergeSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode();
        ListNode mergeListHead = mergeList;

        while(list1 != null && list2 != null){
            
            if(list1.val < list2.val){
                mergeList.next = list1;
                list1 = list1.next;
            }else{
                mergeList.next = list2;
                list2 = list2.next;
            }
            mergeList = mergeList.next;
        }

        if (list1 != null) {
            mergeList.next = list1;
        }else{
            mergeList.next = list2;
        }
        return mergeListHead.next;
    }

}
