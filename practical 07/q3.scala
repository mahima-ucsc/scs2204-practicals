package p7

def filterPrime(list: List[Int]) = 
    list.filter(num => (1 to num).filter(num % _ == 0).length == 2)

@main def q3() =
    val numbers = (-50 to 50).toList
    println(filterPrime(numbers))