package demo

object demo {
  def main(args: Array[String]){
    val name = "mark"
    val age = 18.5

    println("Hello world!")
    println(name + " is " + age + " years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%f years old")
    println("Hello \nworld")
    println(raw"Hello \n world")
  }
}
