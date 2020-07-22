package demo

// var getter setter
// val getter ----
// default ----   ----
class User(private var name: String, var age: Int){
  def printName(){println(name)}
  def printAge(){println(age)}
};

object classes {
  def main(args: Array[String]): Unit = {
    var user = new User("Max", 28);
    user.printName();
    //    println(user.name);
    println(user.age);
    //    user.name = "Tom";
    user.age = 22;
    //    println(user.name);
    user.printName();
    user.printAge();
  }
}
