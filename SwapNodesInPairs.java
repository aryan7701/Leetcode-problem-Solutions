
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temNode = head;
        while (temNode != null) {
            list.add(temNode);
            temNode = temNode.next;
        }
        for (int i = 0; i < list.size() - 1; i += 2) {
            int swapElement = list.get(i).val;
            list.get(i).val = list.get(i + 1).val;
            list.get(i + 1).val = swapElement;
        }
        return head;
    }
    public static void main(String[] args){

}
