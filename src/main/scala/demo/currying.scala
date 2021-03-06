package demo

object currying {
  def add(x:Int, y:Int) = x + y
  def add2(x: Int) = (y: Int) => x + y;
  def add3(x: Int) (y: Int) = x + y;

  def main(args: Array[String]): Unit ={
    println(add(20,10));
    println(add2(40)(10));
    val sum40 = add2(40);
    println(sum40(100));
    println(add3(40)(10));
    val sum50 = add3(50)_;
    println(sum50(400));

  }
}
