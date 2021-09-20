/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixThreads.src;

import matrixThreads.models.MatrixFiller;
import matrixThreads.models.MyTaskThreads;
import org.json.JSONObject;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dimension = 1000;
        MatrixFiller matrixGenerator = new MatrixFiller(dimension);
        JSONObject limits = matrixGenerator.matrixLimits(dimension);
        long totalTimeLapse = 0;
        
        int[][] matrixA = matrixGenerator.fillMatrix();
        int[][] matrixB = matrixGenerator.fillMatrix();
        
        MyTaskThreads mt1 = new MyTaskThreads(matrixA, matrixB, 
                limits.getInt("matrix1RowBegin"), limits.getInt("matrix1RowEnd"), 
                limits.getInt("matrix1ColumnBegin"), limits.getInt("matrix1ColumnEnd"));
        mt1.run();
        totalTimeLapse += mt1.getTimeLapse();
        
        MyTaskThreads mt2 = new MyTaskThreads(matrixA, matrixB, 
                limits.getInt("matrix2RowBegin"), limits.getInt("matrix2RowEnd"), 
                limits.getInt("matrix2ColumnBegin"), limits.getInt("matrix2ColumnEnd"));
        mt2.run();
        totalTimeLapse += mt1.getTimeLapse();
        
        MyTaskThreads mt3 = new MyTaskThreads(matrixA, matrixB, 
                limits.getInt("matrix3RowBegin"), limits.getInt("matrix3RowEnd"), 
                limits.getInt("matrix3ColumnBegin"), limits.getInt("matrix3ColumnEnd"));
        mt3.run();
        totalTimeLapse += mt1.getTimeLapse();
        
        MyTaskThreads mt4 = new MyTaskThreads(matrixA, matrixB, 
                limits.getInt("matrix4RowBegin"), limits.getInt("matrix4RowEnd"), 
                limits.getInt("matrix4ColumnBegin"), limits.getInt("matrix4ColumnEnd"));
        mt4.run();
        totalTimeLapse += mt1.getTimeLapse();
        
        System.out.println("Total time: " + (totalTimeLapse / 1000f));
    }
    
}
