package lyl.demo;

public class LinkList {
    // 单链表翻转
    public Node reverse(Node list){
        Node curr = list, pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }
        return pre;
    }

    //检查环
    public static boolean checkCircle(Node list){
        if (list==null) {
            return false;
        }
        Node slow = list;
        Node fast = list.next;
        while (fast != null && fast.next != null){
            fast = list.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static Node 


    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;

        }

        public int getData(){
            return data;
        }
    }
}
