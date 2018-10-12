package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/10
 */
public class DeleteBackN {
    public void deleteBackN(Node headNode, int N) {
        if (headNode == null || N==0) {
            System.out.println("error: Node is null or N is zero, please check!");
        }else{
            Node nodeBeh = headNode;
            while (N != 0) {
                headNode = headNode.next;
                N--;
            }
            Node nodeBef = headNode;
            while(nodeBef.next!=null){
                nodeBef=nodeBef.next;
                nodeBeh=nodeBeh.next;
            }
            nodeBeh.next=nodeBeh.next.next;
        }
    }
}
