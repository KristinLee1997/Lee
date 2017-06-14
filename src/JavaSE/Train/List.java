package Train;

import java.util.*;

/**
 * Created by Administrator on 2017/5/8.
 */
public class List {
    public static void main(String[] args) {
        L a = new L();
        a.init();
        a.creat(5);
        a.display();
        a.append(7);
        a.display();
        L b = new L();
        b.init();
        b.creat(5);
        b.display();
        a.printCommonPart(a.getHead(), b.getHead());

    }
}

class L {
    Node head;

    public void init() {//定义头节点,并初始化有节点，用来装链表长度
        head = new Node(0);
        head.next = null;
    }

    public Node getHead() {//获取该类对象的头节点
        return this.head;
    }

    public void creat(int n) {//创建一个长度为n的链表
        Scanner input = new Scanner(System.in);
        Node p = head;
        for (int i = 0; i < n; i++) {
            Node a = new Node(input.nextInt());
            p.next = a;
            p = p.next;
        }
        p.next = null;
    }

    public void append(int data) {//在链表末尾追加新的元素
        Node m = new Node(data);
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = m;
        m.next = null;
        head.data++;
    }

    public void delete(int i) {//删除角标为i的元素
        Node p = head.next;
        while (i-- >= 0) {
            p = p.next;
        }
        p.next = p.next.next;
        head.data--;
    }

    public void display() {//遍历链表
        System.out.printf("Print the list ");
        Node p = head.next;
        while (p != null) {
            System.out.printf("%d ", p.data);
            p = p.next;
        }
        System.out.println();
    }

    public int getLength() {//获取链表长度
        return head.data;
    }

    public void printCommonPart(Node head1, Node head2) {//打印两个链表公共部分
        System.out.printf("Common Part:");
        Node p1 = head1.next;
        Node p2 = head2.next;
        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                p1 = p1.next;
            } else if (p1.data > p2.data) {
                p2 = p2.next;
            } else {
                System.out.printf("%d ", p1.data);
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        System.out.println();
    }

    public Node removeLastkthNode(Node head1, int k) {//删除链表倒数第k个元素
        Node p = head.next;
        if (p == null || k < 1) {
            return head;
        }

        while (p != null) {
            k--;
            p = p.next;
        }

        return head;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        void show() {
            System.out.printf("%d ", this.data);
        }
    }

}
