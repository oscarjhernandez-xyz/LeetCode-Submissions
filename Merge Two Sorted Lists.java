/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode startNode;

        // Check if starting nodes are null
        if (list1 == null && list2 == null){
            return null;
        }

        else if (list1 != null && list2 == null) {
            return list1;
        }

        else if (list1 == null && list2 != null) {
            return list2;
        }

        // Otherwise, begin sorting
        else {

            ListNode currentNode;

            // Determine which starting node is larger
            if (list1.val <= list2.val){
                startNode = list1;
                currentNode = list1;
                list1 = list2;
            }

            else {
                startNode = list2;
                currentNode = list2;
            }
            
            // Cycle through nodes until there is none
            while (currentNode.next != null) {

                // Check if next node's value is less than the other list node's value
                if (currentNode.next.val > list1.val) {

                    // Swap lists and designate current node's next node as the other list's current node
                    ListNode tempNode = currentNode.next;
                    currentNode.next = list1;
                    currentNode = currentNode.next;
                    list1 = tempNode;
                }

                // Otherwise, just continue to the next node of the current list
                else{  currentNode = currentNode.next; }
            }
            
            // Check if there are any remaining nodes in the other list, if so, append them
            if (list1 != null) { currentNode.next = list1; }
        }

        return startNode;
    }
}
