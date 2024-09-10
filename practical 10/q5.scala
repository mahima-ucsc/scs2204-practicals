package p10

def countLetterOccurrences(strings: List[String]): Int =
  strings.map(_.length).reduce(_ + _)

@main def q5() =
  val strings = List("apple", "banana", "cherry", "date")
  println("Strings: " + strings)
  println(
    "Total count of letter occurrences: " + countLetterOccurrences(strings)
  )
