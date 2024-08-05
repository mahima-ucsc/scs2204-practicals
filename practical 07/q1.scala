package p7

def filterEvenNumbers(list: List[Int]) = list.filter(_ % 2 == 0)

@main def q1() = 
    val numbers = List(1, 3, 2, 5, 6, 10, 12)
    println(filterEvenNumbers(numbers))
