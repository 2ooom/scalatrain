import com.typesafe.training.scalatrain._

object Reverse {
  def apply(s: String): String = {
    s.reverse
  }
}

Reverse ("Test")
val t1 = new Time(4, 56)
val t2 = Time(1, 2)
t2.minutes
t1.minutes

// Ccollections
var v1 = Vector(1, 2, 3)
v1.reverse

var s1 = Seq(1, 2, 3)
var s2 = Set(1, "2 3", 3.5)

s1 zip Seq(4, 5, 6)

v1 groupBy (_ % 2)

val numbers = Seq(1, 2, 3)
numbers.+:(0)

0 +: numbers

// Tuples
val pair= (1, "a")
pair._1
pair._2

val map = Map(1 -> "a", 3 -> "c")

map(1)
map.get(2)
map(3)
map.getOrElse(4, "d")