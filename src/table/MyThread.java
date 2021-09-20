package table;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class MyThread extends Thread {

    private int numInterations;
    private int sleepTime;
    private int id;
    private String name;

    public MyThread(int id, String name, int numIterations, int sleepTime) {
        this.numInterations = numIterations;
        this.sleepTime = sleepTime;
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();

        for (int i = 1; i <= numInterations; i++) {
            try {
                sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }   
            System.out.println((id * i) + " " + name);
        }
    }
}
