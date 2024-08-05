package p7

def calculateSquare(list: List[Int]) = list.map(Math.pow(_, 2).toInt)

@main def q2() =
    val numbers = List(2, 5, 1, 7)
    println(calculateSquare(numbers))