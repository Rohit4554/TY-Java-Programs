import java.util.Scanner;

public class A1B3MatrixOperations 
{

    private static void matrixAddition(Scanner sc) 
    {
        System.out.print("Enter the number of rows of the matrices: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int c = sc.nextInt();

        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
             {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Resultant matrix after addition:");
        printMatrix(result);
    }

    private static void matrixMultiplication(Scanner sc)
     {
        System.out.print("Enter the number of rows of the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the number of rows of the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int c2 = sc.nextInt();

        if (c1 != r2)
         {
            System.out.println("Matrix multiplication is not possible. Number of columns in first matrix must be equal to number of rows in second matrix.");
            return;
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println(" multiplication Matrix :");
        printMatrix(result);
    }

    private static void matrixTranspose(Scanner sc)
     {
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
             {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        printMatrix(transpose);
    }

    private static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix)
        {
            for (int element : row) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMatrix Operations Menu:");
            System.out.println("1. Addition of two matrices");
            System.out.println("2. Multiplication of two matrices");
            System.out.println("3. Transpose of a matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    matrixAddition(sc);
                    break;
                case 2:
                    matrixMultiplication(sc);
                    break;
                case 3:
                    matrixTranspose(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
