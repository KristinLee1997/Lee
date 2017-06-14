package JavaSE.TestAPI.APIDemo;


import java.util.*;

/**
 * Created by Administrator on 2017/5/23.
 * ----------������ģ�����/��ջ------------
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

class Queue {      //����ģ�����
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void myAdd(Object o) {    //�������Ԫ��
        list.addFirst(o);
    }

    public Object myGet() {//���л�ȡԪ��
        return list.removeLast();
    }

    public boolean isNull() {     //�ж϶����Ƿ�Ϊ��
        return list.isEmpty();
    }
}

class Stack {//����ģ���ջ
    private LinkedList stack;

    public Stack() {
        stack = new LinkedList();
    }

    public void myadd(Object o) {    //��ջ���
        stack.addFirst(o);
    }

    public Object myget() {    //��ȡ��ջԪ��Ϊ��
        return stack.removeFirst();
    }

    public boolean isNull() {    //�ж϶�ջ�Ƿ�
        return stack.isEmpty();
    }
}