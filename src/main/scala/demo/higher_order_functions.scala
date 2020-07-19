package demo

object higher_order_functions {
def math(x: Double, y: Double,z: Double, f: (Double,Double)=>Double): Double = f(f(x,y),z);

  def main(args: Array[String]): Unit ={
    val add = math (50,20,10,(x,y)=>x+y);
    val multiply = math (50,20,10,(x,y)=>x*y);
    val max = math (50,20,10,(x,y)=>x min y);
    val min = math (50,20,10,(x,y)=>x max y);

    println(add);
    println(multiply);
    println(max);
    println(min);

    val add2 = math (50,20,10,_+_);
    val multiply2 = math (50,20,10,_*_);
    val max2 = math (50,20,10,_ min _);
    val min2 = math (50,20,10,_ max _);

    println(add2);
    println(multiply2);
    println(max2);
    println(min2);
  }
}
