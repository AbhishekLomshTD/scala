package demo

object AnonDefault {
object Math{
  def +(x: Int = 45,y: Int = 15): Int = {
    return x + y;
  }
  def **(x: Int): Int = x*x;
}
  def print(x: Int,y: Int): Unit = {
    println(x+y);
  }

  def main(args: Array[String]){
    var add = (x: Int,y: Int) => x + y
    println(add(300,500));
    val sum = 10 * 20;
    print(100,200);
    println(Math.+(60));
    println(Math ** 3);

  }
}
