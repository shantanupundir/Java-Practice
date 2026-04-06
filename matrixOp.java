public class matrixOp {
  public static void main(String[] args) {
    int[][] matrixA = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    int[][] matrixB = {
      {9, 8, 7},
      {6, 5, 4},
      {3, 2, 1}
    };

    //column sum
    for (int j = 0; j < 3; j++) {
      int columnSum = 0;
      for (int i = 0; i < 3; i++) {
        columnSum += matrixA[i][j];
      }
      System.out.println("\nColumn " + (j + 1) + " Sum: " + columnSum);
    }
    //row sum
    for (int i = 0; i < 3; i++) {
      int rowSum = 0;
      for (int j = 0; j < 3; j++) {
        rowSum += matrixA[i][j];
      }
      System.out.println("\nRow " + (i + 1) + " Sum: " + rowSum);
    }
    //diagonal sum
    int diagonalSum = 0;
    for (int i = 0; i < 3; i++) {
      diagonalSum += matrixA[i][i];
    }
    System.out.println("\nDiagonal Sum: " + diagonalSum);
    
  }
}
