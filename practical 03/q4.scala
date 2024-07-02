package p3

def sumOfEvenNumbers(list: List[Int]): Int = list match
    case Nil => 0
    case head :: tail if head % 2 == 0 => list.head + sumOfEvenNumbers(tail)
    case _ :: tail=> sumOfEvenNumbers(tail)

@main def q4() = 
    val list = List(0, 1, 2, 3, 4, 5, 6, 7, 8)
    println(sumOfEvenNumbers(list))