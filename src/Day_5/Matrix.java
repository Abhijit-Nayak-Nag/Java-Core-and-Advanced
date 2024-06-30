package Day_5;

public class Matrix<T> {
    private T[][] matrix;
    private int rows;
    private int columns;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = (T[][]) new Object[rows][columns];
    }

    // Getter for rows
    public int getRows() {
        return rows;
    }

    // Getter for columns
    public int getColumns() {
        return columns;
    }

    // Method to get the element at a specific row and column
    public T getElement(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        return matrix[row][column];
    }

    // Method to set the element at a specific row and column
    public void setElement(int row, int column, T element) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        matrix[row][column] = element;
    }
}
