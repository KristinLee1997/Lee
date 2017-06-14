package Algorithm.OS.ReplacementMothod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by king on 2017/6/14.
 */
public class LRU {
    public static void main(String[] args) {
        int sourceNUm;
        int pageNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入资源数：");
        while (scan.hasNext()) {
            sourceNUm = scan.nextInt();
            System.out.println("请输入页面数：");
            pageNum = scan.nextInt();
            LinkedList<Integer> queue = new LinkedList<>();
            System.out.println("请输入" + sourceNUm + "个资源序列：");
            for (int i = 0; i < sourceNUm; i++) {
                queue.addLast(scan.nextInt());
            }

            LinkedList<Integer> used = new LinkedList<>();
            ArrayList<Page2> page = new ArrayList<>();
            int count = 0;


            for (int i = 0; i < sourceNUm; i++) {
                Integer head = queue.removeFirst();
                if (page.contains(new Page2(head))) {
                    count++;
                    System.out.println("命中");
                }
                used.add(head);
                int next = used.size() - used.lastIndexOf(head);
                if (next == -1) next = Integer.MAX_VALUE;
                if (page.size() < pageNum && !page.contains(new Page2(head))) {
                    page.add(new Page2(head, next));
                } else if (page.size() == pageNum && !page.contains(new Page2(head))) {
                    int ind = findMaxIndex(page);
                    page.set(ind, new Page2(head, next));
                }
                resetAllNext(page, used);
                System.out.println(page);
            }


            System.out.println("总共命中" + count + "次");
            System.out.println("----over----");
        }
    }

    private static void resetAllNext(ArrayList<Page2> page, LinkedList<Integer> queue) {
        for (int i = 0; i < page.size(); i++) {
            int next = queue.size() - queue.lastIndexOf(page.get(i).getSource());
            if (next == -1) next = Integer.MAX_VALUE;
            page.set(i, new Page2(page.get(i).getSource(), next));
        }
    }

    public static int findMaxIndex(ArrayList<Page2> list) {
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(index).getNext() < list.get(i).getNext()) {
                index = i;
            }
        }
        return index;
    }
}

class Page2 {
    Integer source;
    Integer next;

    public Page2() {

    }

    public Page2(Integer source) {
        this.source = source;
    }

    public Page2(Integer source, Integer next) {
        this.source = source;
        this.next = next;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Page2) obj).source.compareTo(this.source) == 0;
    }

    @Override
    public String toString() {
        return source + ""/*+":"+next*/;
    }
}