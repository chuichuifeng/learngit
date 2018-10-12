import main.*;
import org.junit.Before;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/9
 */

public class Test {
    Node headnode1 = new Node();
    Node headnode2 = new Node();

    // static Node headnode2=new Node();
    @Before
    public void beforeTest1() {
        headnode1.data = 5;
        Node node2 = new Node();
        node2.data = 6;
        Node node3 = new Node();
        node3.data = 12;
        Node node4 = new Node();
        node4.data = 14;
        headnode1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //  node4.next=node2; //有环无环

        Node headnode1Copy = new Node(headnode1);
        while (headnode1Copy != null) {
            System.out.print(headnode1Copy.data + "--");
            headnode1Copy = headnode1Copy.next;
        }
        System.out.println();

    }

    @Before
    public void beforeTest2() {
        headnode2.data = 7;
        Node node2 = new Node();
        node2.data = 8;
        Node node3 = new Node();
        node3.data = 13;
        headnode2.next = node2;
        node2.next = node3;
    }


    @org.junit.Test
    public void testReverse() {
        ListReverse listReverse = new ListReverse();
        System.out.println("----------" + headnode1.data);
        Node node = listReverse.reverse(headnode1);
        System.out.println("----------" + node.data);
    }

    @org.junit.Test
    public void testCheckCircle() {
        CheckCircle checkCircle = new CheckCircle();
        HashMap map = checkCircle.isCircle(headnode1);
        boolean flag = map.containsKey(true);
        int len = checkCircle.length(headnode1);
        System.out.println(flag + "-----" + len);
    }

    @org.junit.Test
    public void testInsert() {

        InsertList insertList = new InsertList();
        // Node node=insertList.Insert(headnode2,headnode1);
        Node node = insertList.Merge(headnode1, headnode2);

        while (headnode1 != null) {
            System.out.print(headnode1.data + "--");
            headnode1 = headnode1.next;
        }
        System.out.println();
        while (headnode2 != null) {
            System.out.print(headnode2.data + "--");
            headnode2 = headnode2.next;
        }
        System.out.println();
        while (node != null) {
            System.out.print(node.data + "--");
            node = node.next;
        }
    }

    @org.junit.Test
    public void testDeleteBackN() {
        DeleteBackN deleteBackN = new DeleteBackN();
        deleteBackN.deleteBackN(headnode1, 3);
        while (headnode1 != null) {
            System.out.print(headnode1.data + "--");
            headnode1 = headnode1.next;
        }
    }

    @org.junit.Test
    public void testMiddle() {
        MiddleNode middleNode = new MiddleNode();
        Node resultNode = middleNode.middle(headnode1);
        System.out.print(resultNode.data + "--");
    }

    @org.junit.Test
    public void testArrayStack() {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push("hello1");
        arrayStack.push("hello2");

        String m1 = arrayStack.pop();
        String m2 = arrayStack.pop();
        System.out.println(m1 + "---" + m2);
    }
    @org.junit.Test
    public void testListStack() {
        ListStack listStack = new ListStack();
        listStack.push(3);
        listStack.push(4);

        int m1 = listStack.pop();
        int m2 = listStack.pop();
        System.out.println(m1 + "---" + m2);
    }
}

