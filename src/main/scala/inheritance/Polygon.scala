package inheritance

class Polygon {
  def area: Double = 0.0;
}
abstract class Polygon2{
  def area: Double;
}
object Polygon {
  def main(args: Array[String]) {
    var poly = new Polygon;
    var rect = new Rectangle(55.2, 20);
    var tri = new Triangle(55.2, 20);
    printArea(poly);
    printArea(rect);
    printArea(tri);
    var poly2 = new Rectangle2(44,10);
    printArea2(poly2)
  }
  def printArea2(p: Polygon2) {
    println(p.area);
  }
  def printArea(p: Polygon) {
    println(p.area);
  }
}
