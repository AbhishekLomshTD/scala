package demo

object mapAndfilter {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val opt: Option[Int] = Some(5);

  //  val opt : Option[Int] = None;
  def main(args: Array[String]) {
    println(lst.map(_ * 2));
    println(lst.map(x => x + 2));
    println(lst.map(x => "hi" * x ));
    println("hello".map(_.toUpper));
    println(List(List(1,2,3), List(3,4,5)).flatten);
println(lst.flatMap(x => List(x, x+1)))
  }
}