/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro5
 */
public class Validate {

    // ham check choice menu
    Scanner sc = new Scanner(System.in);

    public int inputChoice() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n < 1 || n > 4) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.print("Enter Again: ");
            }
        }
    }

    // ham check gia tri cot va hàng
    public int inputRowColumn() {
        while (true) {
            try {
                // parse ra định dạng int và loại bỏ khoảng trắng.
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n < 0) {
                    System.out.println("Phải là số >= 0");
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.print("Enter Again: ");
            }
        }
    }

    // ham chech gia tri ma tran
    public int inputInt() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.print("Enter Again: ");
            }
        }
    }

    // ham nhap ma tran 1
    public int[][] inputMatrix1(int matrixNum, int row, int column) {
        int newRow = 0, newCol = 0;
        System.out.print("Enter Row matrix " + matrixNum + ": ");

        newRow = inputRowColumn();

        while (newRow != row && matrixNum == 2) {
            System.out.println("Row matrix " + matrixNum + " should be equal Row Matrix 1");
            newRow = inputRowColumn();
        }
        System.out.print("Enter Column matrix " + matrixNum + ": ");
        newCol = inputRowColumn();
        while (newCol != column && matrixNum == 2) {
            System.out.println("Column matrix " + matrixNum + " should be equal column Matrix 1");
            newCol = inputRowColumn();
        }

        int[][] matrix = new int[newRow][newCol];
        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                System.out.print("Enter Matrix [" + i + "][" + j + "]: ");
                matrix[i][j] = inputInt();
            }
        }
        System.out.println("----------------------------");
        return matrix;

    }

    public int[][] inputMatrixToMul(int matrixNum, int row, int column) {
         int newRow = 0, newCol = 0;
        System.out.print("Enter Row matrix " + matrixNum + ": ");

        newRow = inputRowColumn();

        while (newRow != row && matrixNum == 2) {
            System.out.println("Row matrix " + matrixNum + " should be equal Column Matrix 1");
            newRow = inputRowColumn();
        }
        System.out.print("Enter Column matrix " + matrixNum + ": ");
        newCol = inputRowColumn();

        int[][] matrix = new int[newRow][newCol];
        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                System.out.print("Enter Matrix [" + i + "][" + j + "]: ");
                matrix[i][j] = inputInt();
            }
        }
        System.out.println("----------------------------");
        return matrix;
    }

}
