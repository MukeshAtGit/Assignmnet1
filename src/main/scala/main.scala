object main {
  def main(args: Array[String]): Unit = {

    val interpolation = new Interpolation
    interpolation.printList(List[Int](3, 4, 6, 4) )
    //case 2 => val max = new Max
    //  max.FindMax(list)
    val fibonacci1 = new Fabbonacci
    println(fibonacci1.fibonacci(3))


    val productsum = new ProductSum
    println(productsum.findProductSum(5))


  }

}
