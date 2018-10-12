package main;

import java.util.HashMap;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/9
 */
public class CheckCircle {
    public HashMap isCircle(Node head) {
        Node fast = head;
        Node slow = head;
        HashMap<Boolean, Node> map = new HashMap<>();
        if (head != null && head.next != null) {
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    map.put(true, fast);
                    return map;
                }
            }
        }
        map.put(false, null);
        return map;
    }

    public int length(Node Node) {
        HashMap map = isCircle(Node);
        int len = 0;
        if (map.containsKey(true)) {
            Node fast = (main.Node) map.get(true);
            Node slow = fast;
            do {
                fast = fast.next.next;
                slow = slow.next;
                len++;
            } while (fast != slow);
        }
        return len;
    }
}
