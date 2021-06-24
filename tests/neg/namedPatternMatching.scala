
case class User(name: String, age: Int, city: String)

val user = User(name = "Anna", age = 10, city = "Berlin")

val city = user match
  case User(name = "Tom", name = "John") => ???
