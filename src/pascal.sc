pascal(0, 2)
pascal(1, 2)
pascal(1, 3)
pascal(2, 4)

// pascal triangle, coursera recursion assignment
def pascal(col: Int, row: Int): Int = {

  if (col == 0 || col == row || row == 0)
    return 1
  if (col <  0 || col > row)
    return 0

  return pascal(col - 1, row - 1) + pascal(col, row -1)
}