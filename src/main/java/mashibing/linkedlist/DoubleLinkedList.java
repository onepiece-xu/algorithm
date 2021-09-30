package mashibing.linkedlist;

public class DoubleLinkedList {

    private static class Node{
        int value;
        Node pre;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    //单链表反转
    public static Node reserveNode(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            //获取到当前节点的下一个节点，缓存起来
            next = head.next;
            //将当前节点的下一个节点反指向前一个节点
            head.next = pre;
            //将当前节点的前一个节点反指向后一个节点
            head.pre = next;
            //当前节点往后移
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;

        n2.next = n3;
        n2.pre = n1;

        n3.next = n4;
        n3.pre = n2;

        n4.next = n5;
        n4.pre = n3;

        n5.pre = n4;
        Node head = n1;
        while(head != null){
            System.out.print(head.pre == null ? 0 : head.pre.value);
            System.out.print(head.value);
            System.out.print(head.next == null ? -1 : head.next.value);
            head = head.next;
            System.out.println();
        }
        System.out.println("-----------------");
        head = reserveNode(n1);
        while(head != null){
            System.out.print(head.pre == null ? 0 : head.pre.value);
            System.out.print(head.value);
            System.out.print(head.next == null ? -1 : head.next.value);
            head = head.next;
            System.out.println();
        }
    }
}
