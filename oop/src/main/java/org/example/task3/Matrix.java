package org.example.task3;

public class Matrix {
    private double[][] matrix;
    private int numOfCols;
    private int numOfRows;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        numOfRows = matrix.length;
        numOfCols = matrix[0].length;
    }

    public Matrix(int numOfRows, int numOfCols) {
        this.numOfCols = numOfCols;
        this.numOfRows = numOfRows;
        matrix = new double[numOfRows][numOfCols];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getNumOfCols() {
        return numOfCols;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setValue(int i, int j, double value){
        matrix[i][j] = value;
    }

    public static double getValue(int i, int j, Matrix matrix){
        double[][] m = matrix.getMatrix();
        return m[i][j];
    }

    public static Matrix sumMatrixes(Matrix matrix1, Matrix matrix2){
        if (matrix1.getNumOfRows() == matrix2.getNumOfRows() && matrix1.getNumOfCols() == matrix2.getNumOfCols()){
            Matrix newMatrix = new Matrix(matrix1.getNumOfRows(), matrix1.getNumOfCols());
            for (int i=0; i<matrix1.getNumOfRows(); i++){
                for (int j=0;j<matrix1.getNumOfCols();j++){
                    newMatrix.setValue(i,j,getValue(i,j,matrix1)+getValue(i,j,matrix2));
                }
            }
            return newMatrix;
        }
        else return null;
    }

    public static Matrix multiplyMatrixByConstant(Matrix matrix, double constant){
        for (int i=0; i<matrix.getNumOfRows(); i++){
            for (int j=0;j<matrix.getNumOfCols();j++){
                matrix.setValue(i,j,getValue(i,j,matrix)*constant);
            }
        }
        return matrix;
    }

    public static void matrixPrint(Matrix matrix){
        for (int i=0; i<matrix.getNumOfRows(); i++){
            for (int j=0;j<matrix.getNumOfCols();j++){
                System.out.print(getValue(i,j,matrix)+" ");;
            }
            System.out.println();
        }
    }

    public static Matrix multiplyMatrixes(Matrix matrix1, Matrix matrix2){
        if (matrix1.getNumOfRows() == matrix2.getNumOfRows() && matrix1.getNumOfCols() == matrix2.getNumOfCols()){
            Matrix newMatrix = new Matrix(matrix1.getNumOfRows(), matrix1.getNumOfCols());
            for (int i=0; i<matrix1.getNumOfRows(); i++){
                for (int j=0;j<matrix1.getNumOfCols();j++){
                    newMatrix.setValue(i,j,getValue(i,j,matrix1)*getValue(i,j,matrix2));
                }
            }
            return newMatrix;
        }
        else return null;
    }

}
