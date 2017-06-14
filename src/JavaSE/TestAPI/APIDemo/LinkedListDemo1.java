package JavaSE.TestAPI.APIDemo;


import java.util.*;

/**
 * Created by Administrator on 2017/5/23.
 * ----------用链表模拟队列/堆栈------------
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.myAdd(1);
//        q.myAdd(3);
//        q.myAdd(5);
//        while (!q.isNull()) {
//            System.out.print(q.myGet() + " ");
//        }
        Stack ss = new Stack();
        ss.myadd(1);
        ss.myadd(3);
        ss.myadd(5);
        while (!ss.isNull()) {
            System.out.print(ss.myget() + " ");
        }
    }
}

class Queue {      //链表模拟队列
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void myAdd(Object o) {    //队列添加元素
        list.addFirst(o);
    }

    public Object myGet() {//队列获取元素
        return list.removeLast();
    }

    public boolean isNull() {     //判断队列是否为空
        return list.isEmpty();
    }
}

class Stack {//链表模拟堆栈
    private LinkedList stack;

    public Stack() {
        stack = new LinkedList();
    }

    public void myadd(Object o) {    //堆栈添加
        stack.addFirst(o);
    }

    public Object myget() {    //获取堆栈元素为空
        return stack.removeFirst();
    }

    public boolean isNull() {    //判断堆栈是否
        return stack.isEmpty();
    }
}