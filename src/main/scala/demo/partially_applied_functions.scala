package demo

import java.util.Date

object partially_applied_functions {
  def log(date: Date, message: String): Unit ={
  println(date + "  " + message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)
    println(f(100, 20));

    val date = new Date;
    val newlog = log(date, _: String);
    newlog("The message 1");
    newlog("The message 2");
    newlog("The message 3");


  }
}
