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

// Functional collections

numbers.map(_.toString + 1)
numbers.map(n => n + 1)

// Currying
def add(a: Int)(b: Int): Int = {
  a + b
}

val addOne: Int => Int = add(1)

numbers.map(x => addOne(x))

// For loop

for {
  n <- 1 to 3
  m <- 1.to(n)
} yield println(n*m)

for (n <- Set(1, 2, 3) if n % 2 == 1) yield "#" + n

// Inheritance

class Animal {
  def eat() = println("Nom-nom")
}

class Bird extends Animal {
  override def eat() = println("Twi-twi")
  def fly = println("Flying")
}
new Animal().eat
new Bird().eat()

// Traits

trait Swimmer {
  def swim
}