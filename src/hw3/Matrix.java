package hw3;

public class Matrix {
    private double[][] array;
    private int rows, cols;

    public Matrix(int rows, int cols, double... values) {
        this.rows = rows;
        this.cols = cols;
        array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = values[i * cols + j];
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addi(Matrix second) {
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]+ second.array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void multiply(double factor) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] *= factor;
            }
        }
    }

    public static void main(String[] args) {
        Matrix a = new Matrix(3, 3, 1,2,3,4,5,6,7,8,9);
        Matrix b = new Matrix(3, 3, 9,8,7,6,5,4,3,2,1);

        System.out.println("Matrix A:");
        a.print();

        System.out.println("Matrix B:");
        b.print();

        System.out.println("Sum:");
        a.addi(b);

        System.out.println("A multiplied by 2:");
        a.multiply(2);
        a.print();
    }
}
