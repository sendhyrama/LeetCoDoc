class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
    
    // Check rows
    for (i in 0 until 9) {
        val rowSet = HashSet<Char>()
        for (j in 0 until 9) {
            val cell = board[i][j]
            if (cell != '.') {
                if (rowSet.contains(cell)) {
                    return false
                }
                rowSet.add(cell)
            }
        }
    }

    // Check columns
    for (j in 0 until 9) {
        val colSet = HashSet<Char>()
        for (i in 0 until 9) {
            val cell = board[i][j]
            if (cell != '.') {
                if (colSet.contains(cell)) {
                    return false
                }
                colSet.add(cell)
            }
        }
    }

    // Check 3x3 sub-grid
    for (block in 0 until 9) {
        val subGridSet = HashSet<Char>()
        val startX = block % 3 * 3
        val startY = block / 3 * 3
        for (i in startY until startY + 3) {
            for (j in startX until startX + 3) {
                val cell = board[i][j]
                if (cell != '.') {
                    if (subGridSet.contains(cell)) {
                        return false
                    }
                    subGridSet.add(cell)
                }
            }
        }
    }
    return true
    }
}