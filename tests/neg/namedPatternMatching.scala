
case class User(name: String, age: Int, city: String)

val user = User(name = "Anna", age = 10, city = "Berlin")

val city = user match
  case User(name = "Tom", name = "John") => ???

class NormalClass(val a: Int)
object NormalClass {
  def unapply(normalClass: NormalClass): Some[Int] =
    Some(normalClass.a)
}

val normal = new NormalClass(1) match
  case NormalClass(a = aInt) => aInt
