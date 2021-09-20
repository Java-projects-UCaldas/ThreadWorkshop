package table;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        
        MyThread t1 = new MyThread( 1 , "A" , 60 , 1000 );
         t1.start();

         MyThread t2 = new MyThread( 2 , "B" , 30 , 2000 );
         t2.start();

         MyThread t3 = new MyThread( 3 , "C" , 20 , 3000 );
         t3.start();

         MyThread t4 = new MyThread( 4 , "D" , 15 , 4000 );
         t4.start();

         MyThread t5 = new MyThread( 5 , "E" , 12 , 5000 );
         t5.start();

         MyThread t6 = new MyThread( 6 , "F" , 10 , 6000 );
         t6.start();
    }
}
