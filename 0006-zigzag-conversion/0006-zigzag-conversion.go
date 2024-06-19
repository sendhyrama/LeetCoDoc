func convert(s string, numRows int) string {
    if numRows == 1 {
		return s
	}

	rows := make([]string, min(numRows, len(s)))
	currentRow := 0
	goingDown := false

	for i := 0; i < len(s); i++ {
		rows[currentRow] += string(s[i])
		if currentRow == 0 || currentRow == numRows-1 {
			goingDown = !goingDown
		}
		if goingDown {
			currentRow++
		} else {
			currentRow--
		}
	}

	return strings.Join(rows, "")
}