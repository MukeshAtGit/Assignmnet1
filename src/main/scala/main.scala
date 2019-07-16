object main {
  def main(args: Array[String]): Unit = {

    val list = List[Int](2,4,44,5)

    val interpolation = new Interpolation
    interpolation.printList(list)

    val max1 = new Max
   println( max1.max(list) )

    val fibonacci1 = new Fabbonacci
    println(fibonacci1.fibonacci(3))


    val productsum = new ProductSum
    println(productsum.findProductSum(5))


  }

}
