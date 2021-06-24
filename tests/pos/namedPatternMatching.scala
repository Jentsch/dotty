package patterns

case class User(name: String, age: Int, city: String)

val user = User(name = "Anna", age = 10, city = "Berlin")

val annasCity = user match
  case User(name = "Tom") => ???
  case User(city = c, name = "Anna") => c
  case User(city = city, name = "Guy") => city

@main
def main(): Unit = {
  println(annasCity)
}
