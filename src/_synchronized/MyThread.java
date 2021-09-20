package _synchronized;

/**
 *
 * @author Lucas
 */
public class MyThread extends Thread {

    private int[] number;
    private int id;

    public MyThread(int id, int[] number) {
        this.number = number;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            synchronized (number) {
                number[0] = number[0] + 1;
            }
        }
        System.out.println("Número al fin del hilo " + id + ": " + number[0]);
    }
}
