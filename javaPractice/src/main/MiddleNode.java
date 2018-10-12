package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/11
 */
public class MiddleNode {

    public Node middle(Node headNode) {
        if (headNode == null) {
            System.out.println("this is no node in this list");
            return null;
        }
        Node before = headNode;
        Node behind = headNode;
        while (before != null && before.next != null) {
            before = before.next.next;
            behind = behind.next;
        }
        return behind;
    }
}
