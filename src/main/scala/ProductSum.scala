class ProductSum {
  def findProductSum(number: Int):Int={
    def findProduct(num:Int,product:Int=1): Int= {
      num match {
        case 0 | 1 => product
        case _ => findProduct(num - 1, product * num)
      }
    }

    def findSum(p:Int,sum:Int=0):Int= {
      p match {
        case 0 => sum
        case _ => findSum(p / 10, p %10 + sum)
      }
    }
    findSum(findProduct(number))
  }

}
