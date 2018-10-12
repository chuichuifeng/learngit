package main;


/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/11
 */
//基于链表实现栈
public class ListStack {
  private Node nodePr=null;


    public ListStack() {
        nodePr = null;
    }

    public void push(int tmp) {
        Node newNode = new Node(tmp);
        if (nodePr == null) {
            nodePr = newNode;
        }
        newNode.next=nodePr;
        nodePr=newNode;
    }

    public Integer pop() {
        if (nodePr == null) {
            System.out.println("there is no node in this stack");
            return null;
        }
        int m = nodePr.data;
        nodePr=nodePr.next;
        return m;
    }

}
