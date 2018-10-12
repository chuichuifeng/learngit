package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/9
 */
public class Node {

    public int data;
    public Node next = null;

    public Node(Node node) {
        this.data = node.data;
        this.next = node.next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;

    }

    public Node() {
        this.data = 0;
        this.next = null;
    }

}
