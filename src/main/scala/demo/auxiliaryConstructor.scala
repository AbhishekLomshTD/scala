
package demo

// var getter setter
// val getter ----
// default ----   ----
class User2(private var name: String, var age: Int){
def this(){
  this("Tom",35);
}
  def this(name : String){
    this(name, 22)
  }
  def this(age : Int){
    this("Ram", age)
  }
};

object auxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    var user = new User2("Max", 28);
    var user2 = new User2();
    var user3 = new User2("Max");
    println(user.age);
    println(user2.age);
    println(user3.age);

  }
}

