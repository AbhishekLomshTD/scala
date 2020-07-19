package demo

object options {
val lst =  List(1,2,3)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val opt : Option[Int] = Some(5);
//  val opt : Option[Int] = None;
  def main(args: Array[String]){
    println(lst.find(_ > 6).getOrElse(0));
    println(map.get(11).getOrElse("No name found"));
    println(opt.isEmpty)
    println(opt.get)
  }
}
