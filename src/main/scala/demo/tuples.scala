package demo

object tuples {
  val mytuple = (1,2,"hello",true);
  val mytuple2 = new Tuple3(1,2,"hello");
  val mytuple3 = new Tuple3(1,"hello",(2,3));
def main(args: Array[String]): Unit ={
  println(mytuple);
  println(mytuple2);
  println(mytuple3);

  println(mytuple._4);
  println(mytuple3._1);

  mytuple.productIterator.foreach{
    i => println(i)
  }

  println(1 -> "Tom" -> true)
  println(mytuple3._3._2);
}
}
