package _noSynchronized;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {0};
        MyThread t1 = new MyThread(1, number);
        t1.start();
        
        MyThread t2 = new MyThread(2, number);
        t2.start();
        
        MyThread t3 = new MyThread(3, number);
        t3.start();
        
        MyThread t4 = new MyThread(4, number);
        t4.start();
    }
}
