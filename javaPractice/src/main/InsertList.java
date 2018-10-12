package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/9
 */
public class InsertList {
    //以其中一个链表为base表，另一个表向其中插入数据
// 测试失败，需要考虑的情况太多，很多漏洞~~~ 后来在网上发现了merger，很简便
    public Node Insert(Node headNode1, Node headNode2) {
        Node headNode = null;
        Node base = new Node(headNode1);
        Node step = new Node(headNode2);
        if (base == null) {
            headNode = step;
        }
        if (step == null) {
            headNode = base;
        }
        if (base != null && step != null) {
            headNode = base;
            Node prebase = null;
            while (step != null) {
                while (base != null) {
                    if (base.data >= step.data) {
                        Node insertNode = new Node(step.data);

                        if (prebase == null) {
                            insertNode.next = base;
                            headNode = insertNode;
                        } else {
                            prebase.next = insertNode;
                            insertNode.next = base;
                            prebase = insertNode;
                        }
                        break;
                    }
                    prebase = base;
                    base = base.next;
                }

                step = step.next;
            }
        }
        return headNode;
    }

    //思想是，同时遍历两个链表，按照顺序向一条链表上加Node，组成一个新链表
    public Node Merge(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        Node tmp1 = new Node(list1);
        Node tmp2 = new Node(list2);
        Node head = new Node(0);//这里不能把返回链表赋值为null，因为下一行马上就要把它赋值给另一链表，得让它在内存里有位置才行
        Node headptr = head;
        while (tmp1 != null && tmp2 != null) {

            if (tmp1.data <= tmp2.data) {
                head.next = tmp1;
                head = head.next;
                tmp1 = tmp1.next;
            } else {
                head.next = tmp2;
                head = head.next;
                tmp2 = tmp2.next;
            }
        }
        //其中一个链表已经跑到头之后，继续单链表的合并
        while (tmp1 != null) {
            head.next = tmp1;
            head = head.next;
            tmp1 = tmp1.next;
        }
        while (tmp2 != null) {
            head.next = tmp2;
            head = head.next;
            tmp2 = tmp2.next;
        }
        head = headptr.next;
        return head;

    }

}
