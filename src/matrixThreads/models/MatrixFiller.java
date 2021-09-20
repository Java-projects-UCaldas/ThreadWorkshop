/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixThreads.models;

import java.util.Random;
import org.json.JSONObject;

/**
 *
 * @author Lucas
 */
public class MatrixFiller {
    
    int[][] matrix = null;
    
    public MatrixFiller(int dimension){
        
        matrix = new int[dimension][dimension];
        
    }
    
    public int[][] fillMatrix() {
        Random random = new Random();
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(10);
            }
        }
        
        return matrix;
    }
    
    public JSONObject matrixLimits(int dimension){
        JSONObject limits = new JSONObject();
        
        limits.put("matrix1RowBegin", 0);
        limits.put("matrix1RowEnd", (dimension/2));
        limits.put("matrix1ColumnBegin", 0);
        limits.put("matrix1ColumnEnd", (dimension/2));
        limits.put("matrix2RowBegin", (dimension/2));
        limits.put("matrix2RowEnd", dimension);
        limits.put("matrix2ColumnBegin", 0);
        limits.put("matrix2ColumnEnd", (dimension/2));
        limits.put("matrix3RowBegin", 0);
        limits.put("matrix3RowEnd", (dimension/2));
        limits.put("matrix3ColumnBegin", (dimension/2));
        limits.put("matrix3ColumnEnd", dimension);
        limits.put("matrix4RowBegin", (dimension/2));
        limits.put("matrix4RowEnd", dimension);
        limits.put("matrix4ColumnBegin", (dimension/2));
        limits.put("matrix4ColumnEnd", dimension);
        return limits;
    }
}
