package copy;

import java.util.PriorityQueue;

public class A2 {
    public static void main(String[] args) {
        A2 t = new A2();
        t.func();
    }

    public void func() {
        int m = 5;
        PriorityQueue<Integer>[] pq = new PriorityQueue[m];
        for (int i = 0; i < pq.length; i++) {
            pq[i] = new PriorityQueue<>();
        }
        System.out.println("hello world");
    }

    public void t1() {
        Integer i1 = 173654;
        System.out.println();
    }
}
