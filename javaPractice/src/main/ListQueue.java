package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/12
 */
public class ListQueue {
    Node nodeHead = null;
    Node nodeTail = null;

    public void enqueue(int num) {
        Node newNode = new Node(num);
        if (nodeTail == null) {
            nodeTail = newNode;
        }
        newNode.next = nodeTail;
        nodeTail = nodeTail.next;
    }

    public Integer dequeue() {
        if (nodeTail == nodeHead) {
            return null;
        }
        int tmp = nodeHead.data;
        nodeHead = nodeHead.next;
        return tmp;
    }
}
