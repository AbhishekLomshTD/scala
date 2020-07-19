package demo

object closures {
  val number = 10;
  //  val add = (x: Int) => x + number;
  val add = (x: Int) => {
    x + number;

  }

  def main(args: Array[String]): Unit = {
    //    number = 100;
    println(add(20))
    println(number)
  }
}
