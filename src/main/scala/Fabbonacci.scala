class Fabbonacci {
  def fibonacci(number: Int, pre: Int = 0, next: Int = 1): Int = {
    number match {
      case 0 => pre
      case _ => fibonacci(number - 1, next, next + pre)
    }
  }

}
