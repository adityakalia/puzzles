
val ratings = Array(2,4,3,2)
(0 to ratings.length - 1 map (n => candy(n, ratings))).foldLeft(0)((a, b) => a + b)

// http://www.programcreek.com/2014/03/leetcode-candy-java/

def candy(n: Int, ratings: Array[Int]): Int = {
  if (n >= ratings.length || n < 0)
    return 0

  if (value(n, ratings) > value(n - 1, ratings) && value(n, ratings) > value(n+1, ratings)) {
    val nMinusOne = candy(n - 1, ratings)
    val nPlusOne = candy(n + 1, ratings)
    if (nMinusOne > nPlusOne)
      return nMinusOne + 1
    else
      return nPlusOne + 1
  }

  if (value(n, ratings) > value(n - 1, ratings) && value(n, ratings) < value(n+1,ratings)) {
    return candy(n - 1, ratings) + 1
  }

  if (value(n, ratings) < value(n - 1 , ratings) && value(n, ratings) > value(n+1, ratings)) {
    return candy(n + 1, ratings) + 1
  }

  return 1
}

def value(n: Int, ratings :Array[Int]): Int = {
 if (n > ratings.length - 1 || n < 0)
   return 0

  ratings(n)
}

