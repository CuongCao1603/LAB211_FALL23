/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Common.Validate;
import Controller.Controller;

/**
 *
 * @author Acer Nitro5
 */
public class View {

    // ham menu
//    View v = new View();
    Controller c = new Controller();
    Validate m = new Validate();

    int[][] matrix1;
    int[][] matrix2;
    int[][] result = null;

    public void menu() {
        System.out.println("=======Calculator Program=======");
        System.out.println("1. Add matrix");
        System.out.println("2. Subtraction matrix");
        System.out.println("3. Multiplication matrix");
        System.out.println("4. Quit");
        System.out.print("Please a choice: ");
    }

    public void addMatrix() {
        System.out.println("--------Addition---------");
        matrix1 = m.inputMatrix1(1, 0, 0);// nhap ma tran 1
        matrix2 = m.inputMatrix1(2, matrix1.length, matrix1[0].length); // nhap ma tran 2
//        matrix2 = m.inputMatrix1(); // nhap ma tran 2
        result = null;
        result = c.addMatrix(matrix1, matrix2); // cong 2 ma tran
     
            // bieu dien ket qua
            display(matrix1);
            System.out.println("+");
            display(matrix2);
            System.out.println("=");
            display(result);
        
    }

    public void subtractionMatrix() {
        System.out.println("--------Subtraction--------");
        matrix1 = m.inputMatrix1(1, 0, 0);// nhap ma tran 1
        matrix2 = m.inputMatrix1(2, matrix1.length, matrix1[0].length); // nhap ma tran 2
        result = null;
        result = c.subtractionMatrix(matrix1, matrix2); // tru 2 ma tran
  
            // bieu dien ket qua
            display(matrix1);
            System.out.println("-");
            display(matrix2);
            System.out.println("=");
            display(result);
        
    }

    public void multipleMatrix() {
        System.out.println("---------Multiplication---------");
        matrix1 = m.inputMatrixToMul(1, 0, 0);// nhap ma tran 1
        matrix2 = m.inputMatrixToMul(2, matrix1[0].length,matrix1.length); // nhap ma tran 2
        result = null;
        result = c.multipleMatrix(matrix1, matrix2);// nhan 2 ma tran
   
            display(matrix1);
            System.out.println("*");
            display(matrix2);
            System.out.println("=");
            display(result);
        
    }
    // ham biểu dienx ma tran 

    public void display(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
