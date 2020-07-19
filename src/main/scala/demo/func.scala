package demo

object func {

  object Math {

    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def subtract(x: Int, y: Int): Int = {
      return x - y;
    }

    def square(x: Int): Int = x*x;
  }
    def divide(x: Int, y: Int): Int = x / y;

    def multiply(x: Int, y: Int): Int = x * y;

  def main(args: Array[String]){
    println(Math square 3)
    println(Math.add(1,2))
    println(Math.subtract(1,2))
    println(multiply(1,2))
    println(divide(1,2))
  }
}
