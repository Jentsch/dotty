package patterns

case class User(name: String, age: Int, city: String)

val user = User(name = "Anna", age = 10, city = "Berlin")

val annasCity = user match
  case User(name = "Tom", city = city) => ???
  case User(city = c, name = s"Ann$_") => c
  case User(name = guy @ ("Guy" | "guy")) => ???

@main
def main(): Unit = {
  println(annasCity)
}
