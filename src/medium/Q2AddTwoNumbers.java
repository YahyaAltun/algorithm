package medium;

//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
//    Example 2:
//
//    Input: l1 = [0], l2 = [0]
//    Output: [0]
//    Example 3:
//
//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]

import Utils.ListNode;

public class Q2AddTwoNumbers {
    public static void main(String[] args){

        ListNode l1 = new ListNode(2,
                        new ListNode(4,
                            new ListNode(3)));

        ListNode l2 = new ListNode(5,
                        new ListNode(6,
                            new ListNode(4)));

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum = sum+l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum+l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            int nodeVal = sum % 10;

            curr.next = new ListNode(nodeVal);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
