class Solution {
  void solveSudoku(List<List<String>> board) {
    if (solve(board)) {
      printBoard(board);
    } 
  }
  
  bool solve(List<List<String>> board) {
    List<int> emptySpot = findEmptySpot(board);
    if (emptySpot[0] == -1) {
      return true; // solved
    }

    int row = emptySpot[0];
    int col = emptySpot[1];

    for (int num = 1; num <= 9; num++) {
      if (isSafe(board, row, col, num.toString())) {
        board[row][col] = num.toString();

        if (solve(board)) {
          return true;
        }

        board[row][col] = '.'; // retrace
      }
    }

    return false; // solution not found
  }

  bool isSafe(List<List<String>> board, int row, int col, String num) {
    // number checking if not already in current row
    for (int x = 0; x < 9; x++) {
      if (board[row][x] == num) {
        return false;
      }
    }

    // number checking if not already in current column
    for (int x = 0; x < 9; x++) {
      if (board[x][col] == num) {
        return false;
      }
    }

    // number checking if not already in current 3x3 sub-box
    int startRow = row - row % 3;
    int startCol = col - col % 3;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i + startRow][j + startCol] == num) {
          return false;
        }
      }
    }

    return true;
  }

  List<int> findEmptySpot(List<List<String>> board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          return [i, j];
        }
      }
    }
    return [-1, -1];
  }

  void printBoard(List<List<String>> board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 8) {
          print(board[i][j]);
        } else {
          stdout.write('${board[i][j]} ');
        }
      }
    }
  }
}