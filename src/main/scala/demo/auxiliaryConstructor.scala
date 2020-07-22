
package demo

// var getter setter
// val getter ----
// default ----   ----
class User2(private var name: String, var age: Int){

};

object auxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    var user = new User2("Max", 28);

  }
}

