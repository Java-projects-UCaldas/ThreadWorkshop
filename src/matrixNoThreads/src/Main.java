/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixNoThreads.src;

import matrixNoThreads.models.MyTaskNoThreads;



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
        
        MyTaskNoThreads m1 = new MyTaskNoThreads(dimension);
        //m1.printMatrix("m1");
        MyTaskNoThreads m2 = new MyTaskNoThreads(dimension);
        //m2.printMatrix("m2");
        MyTaskNoThreads product = new MyTaskNoThreads(dimension);
        
        product.setMatrix(m1.scalarProduct(m2));
        
       // product.printMatrix("product");
        
    }
    
}
