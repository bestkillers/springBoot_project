package copy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class A1 {
    volatile int state = 2;
    Object b = new Object();

    public static void main(String[] args) {
        A1 a = new A1();
        new Thread(() -> {
            // TODO Auto-generated method stub
            System.out.println("线程一");
            synchronized (a) {
                a.state--;
                if (a.state == 0)
                    a.notifyAll();
            }

        }).start();
        new Thread(() -> {
            // TODO Auto-generated method stub
            System.out.println("线程二");
            synchronized (a) {
                a.state--;
                if (a.state == 0)
                    a.notifyAll();
            }
        }).start();

        synchronized (a) {
            if (a.state > 0) {
                try {
                    a.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else
                a.notifyAll();

        }

        System.out.println("主线程开始后续了");
    }

}