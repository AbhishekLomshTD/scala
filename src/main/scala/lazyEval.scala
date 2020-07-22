







class lazyEval{
  lazy val l: Int = {
    println("lazy");
    9
  }
}

class strict{
  val e: Int = {
    println("strict");
    9
  }
}


object lazyEval {
  def method1(n: Int): Unit ={
    println("Method 1");
    println(n);
  }
  def method2(n: Int): Unit ={
    println("Method 2");
    println(n);
  }
  def main(args: Array[String]): Unit ={
        val x = new strict;
        val y = new lazyEval;
        println(x.e);
        println(y.l);
    val add = (a: Int, b: Int) => {
      println("Add");
      a+b
    }
    method1(add(5,6));
    method2(add(5,6));
  }
}