/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Lucas
 */
public class MyTaskNoThreads {

    private int n;
    private int[][] matrix;

    public MyTaskNoThreads(int newDimension) {
        n = newDimension;
        matrix = new int[n][n];
        fillMatrix();
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the matrix
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the matrix to set
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    private void fillMatrix() {
        Random random = new Random();
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(10);
            }
        }
    }

    public int[][] scalarProduct(MyTaskNoThreads newMatrix) {
        
        int[][] bMatrix = newMatrix.getMatrix();
        
        int[][] scalarProduct = new int[matrix.length][bMatrix[0].length];

        if (matrix[0].length == bMatrix.length) {
            for (int a = 0; a < bMatrix[0].length; a++) {
                for (int i = 0; i < matrix.length; i++) {
                    int add = 0;
                    for (int j = 0; j < matrix[0].length; j++) {
                        add += matrix[i][j] * bMatrix[j][a];
                    }
                    scalarProduct[i][a] = add;
                }
            }
        }
        return scalarProduct;
    }
    
    public void printMatrix(String name){
        System.out.println("Matrix: " + name);
        System.out.println("**************************************************");
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("**************************************************");
    }
}
