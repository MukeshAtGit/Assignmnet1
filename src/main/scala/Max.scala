class Max {
  def max(list: List[Int]): Int = {
    if (list.length != 0) {
      def findMax(list: List[Int], max: Int = list.head): Int = {


        list.head match {
          case _ if ((list.head > max) && (list.tail == Nil)) => list.head
          case _ if (list.tail == Nil) => max
          case _ if (list.head > max) => findMax(list.tail, list.head)
          case _ => findMax(list.tail, max)
        }
      }

      return findMax(list)
    }
    else {
      println("enter valid list")
      return 0
    }
  }
}