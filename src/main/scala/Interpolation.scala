class Interpolation {
  def printList(list: List[Int], i: Int = 0): Unit = {
    val Len: Int = list.length -1
    i match {
      case Len => println(s"$i =${list(i)}")
      case _ if(Len>i)=>{
        println(s"$i = ${list(i)}")
        printList(list, i + 1)
      }

      case _ => println("enter valid list")

    }
  }

}
