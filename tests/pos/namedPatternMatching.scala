package patterns

import scala.annotation.patternNames

class Age(val hidden: Int)

object Age:
  def apply(years: Int): Age = new Age(years)

  @patternNames("years")
  def unapply(age: Age): Option[Int] = Some(age.hidden)

case class User(name: String, age: Age, city: String)

val user = User(name = "Anna", age = Age(10), city = "Berlin")

val annasCity = user match
  case User(name = "Tom", city = city) => ???
  case User(city = c, name = s"Ann$_") => c
  case User(name = guy @ ("Guy" | "guy")) => ???

// nested patterns
val User(name = name, age = Age(years = years)) = user

// partial funtion
val maybeTom = Some(user).collect {
  case u @ User(name = "Tom") => u
}

val berlinerNames = for
  case User(city = "Berlin", name = name) <- List(user)
yield name

@main
def main(): Unit =
  println(annasCity)
  println(name)
  println(years)

  println(maybeTom)
  println(berlinerNames)

