package demo

object maps {
  val mymap: Map[Int, String] = Map(801 -> "max", 802 -> "Tom", 803 -> "tom3", 804 -> "July", 804 -> "Julyy");
  val mymap2: Map[Int, String] = Map(805 -> "lua");

  def main(args: Array[String]) {
    println(mymap);
    println(mymap(802));
    println(mymap(803));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);

    mymap.keys.foreach { key =>
      println("key " + key);
      println("value " + mymap(key));
    }

    println(mymap.contains(8041))
    println(mymap ++ mymap2)
    println(mymap.size)
  }
}
