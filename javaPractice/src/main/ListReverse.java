package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/9
 */
public class ListReverse {
    public Node reverse(Node node1) {
        Node pre = null;
        Node next = null;
        Node cur = node1;
        Node headNode = null;
        while (cur != null) {
            next = cur.next;
            if (next==null) {
                headNode=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return headNode;
    }
}
