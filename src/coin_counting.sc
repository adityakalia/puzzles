
val coins:List[Int] = List(1,2,3, 5)
countChange(6, coins)

def countChange(money:Int, coins:List[Int]) : Int = {
  val combinations = count(money, coins, 0, 0, List(), Set())
  return combinations.size
}

def count(money:Int, coins: List[Int], currTotal: Int, acc:Int, combList:List[Int], totalComb: Set[List[Int]]) : Set[List[Int]] = {
  if (currTotal == money) {
    return totalComb + combList.sortWith((x, y)=> x < y)
  }
  if (currTotal > money)
    return totalComb;

  var total = totalComb
  coins.foreach {x =>
    total = count(money, coins, currTotal + x, acc, x::combList, total)
  }
  total
}