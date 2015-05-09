import scala.annotation.tailrec

balance("[[][[]]]".toList, 0)

@tailrec
def balance(chars:List[Char], i: Int): Boolean = {
  if (chars.isEmpty && i > 0)
    return false

  if (chars.isEmpty && i == 0)
    return true

  if (chars.head == ']' && i == 0)
    return false

  var r = i
  if (chars.head == '[')
      r = i + 1
  if (chars.head == ']')
      r = i - 1

  balance(chars.tail, r)
}
