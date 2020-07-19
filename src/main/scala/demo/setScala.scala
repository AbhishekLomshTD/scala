package demo

object setScala {
  val myset: Set[Int] = Set(1,2,5,8,9,6,4,4)
  val myset2: Set[Int] = Set(9,11,12,15,18,19,16,14,14)
//var myset = scala.collection.mutable.Set(1,2,5,8,9,6,4,4)
  val names: Set[String] = Set("Max","Tom","John");
  def main(args: Array[String]): Unit ={
    println(myset);
    println(myset+10);
    println(myset(110));

    println(myset ++ myset2);

    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);

    myset.foreach(println);
    for (name <- names){
      println(name)
    }
  }
}
