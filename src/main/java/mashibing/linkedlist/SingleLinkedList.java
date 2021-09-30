package mashibing.linkedlist;

public class SingleLinkedList {

    private static class Node{
        int value;
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
            //当前节点往后移
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        Node n2 = reserveNode(n1);
        while(n2 != null){
            System.out.print(n2.value);
            n2 = n2.next;
        }
    }
}
