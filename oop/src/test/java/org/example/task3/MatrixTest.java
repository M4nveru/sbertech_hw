package org.example.task3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void sumMatrixes() {
        Matrix m1 = new Matrix(new double[][] {{1,2,3},{4,5,6}});
        Matrix m2 = new Matrix(new double[][] {{1,1,1},{1,1,1}});
        Matrix result = Matrix.sumMatrixes(m1,m2);
        Assert.assertTrue(Arrays.deepEquals(result.getMatrix(), new double[][] {{2,3,4},{5,6,7}}));
    }

    @Test
    public void multiplyMatrixByConstant() {
        Matrix m1 = new Matrix(new double[][] {{1,2,3},{4,5,6}});
        Matrix m2 = new Matrix(new double[][] {{1,1,1},{1,1,1}});
        Matrix result1 = Matrix.multiplyMatrixByConstant(m1, 0);
        Matrix result2 = Matrix.multiplyMatrixByConstant(m2, 5);

        Assert.assertTrue(Arrays.deepEquals(result1.getMatrix(), new double[][] {{0,0,0},{0,0,0}}));
        Assert.assertTrue(Arrays.deepEquals(result2.getMatrix(), new double[][] {{5,5,5},{5,5,5}}));
    }

    @Test
    public void multiplyMatrixes() {
        Matrix m1 = new Matrix(new double[][] {{1,2,3},{4,5,6}});
        Matrix m2 = new Matrix(new double[][] {{2,2,2},{2,2,2}});
        Matrix result = Matrix.multiplyMatrixes(m1,m2);
        Assert.assertTrue(Arrays.deepEquals(result.getMatrix(), new double[][] {{2,4,6},{8,10,12}}));
    }
}