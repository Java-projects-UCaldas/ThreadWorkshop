/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixThreads.models;

/**
 *
 * @author Lucas
 */
public class MyTaskThreads implements Runnable {

    private Thread theThread = null;
    private long theTimeLapse = -1;
    private int[][] matrixA = null;
    private int[][] matrixB = null;
    private int[][] result = null;
    private int rowBegin = 0;
    private int rowEnd = 0;
    private int columnBegin = 0;
    private int columnEnd = 0;
    
    public MyTaskThreads(int[][] newMatrixA, int[][] newMatrixB,
            int newRowBegin, int newRowEnd, int newColumnBegin, int newColumnEnd) {
        matrixA = newMatrixA;
        matrixB = newMatrixB;
        rowBegin = newRowBegin;
        rowEnd = newRowEnd;
        columnBegin = newColumnBegin;
        columnEnd = newColumnEnd;
    }
    
    public Thread start(){
        if(getThread() == null){
            setThread(new Thread(this));
            getThread().start();
        }
        getThread().start();
        
        return getThread();
    }

    /**
     * @return the theThread
     */
    public Thread getThread() {
        return theThread;
    }

    /**
     * @param theThread the theThread to set
     */
    public void setThread(Thread theThread) {
        this.theThread = theThread;
    }

    /**
     * @return the theTimeLapse
     */
    public long getTimeLapse() {
        return theTimeLapse;
    }

    /**
     * @param theTimeLapse the theTimeLapse to set
     */
    public void setTimeLapse(long theTimeLapse) {
        this.theTimeLapse = theTimeLapse;
    }

    public int[][] matrixMultiplier() {
        
        result = new int[matrixA.length][matrixB[0].length];
        
        if (matrixA == matrixB) {
            for (int a = rowBegin; a < rowEnd; a++) {
                for (int i = columnBegin; i < columnEnd; i++) {
                    int add = 0;
                    for (int j = rowBegin; j < rowEnd; j++) {
                        add += matrixA[i][j] * matrixB[j][a];
                    }
                    result[i][a] = add;
                }
            }
        }
        
        return result;
    }
    
    @Override
    public void run() {
        long ini = 0;
        long end = 0;
        long dif = 0;
        
        ini = System.currentTimeMillis();
        
        matrixMultiplier();
        
        end = System.currentTimeMillis();
        
        dif = end - ini;
        
        theTimeLapse = dif;
        
        System.out.println("Final time: " + (theTimeLapse / 1000f) + " seconds.");        
    }
    
}
