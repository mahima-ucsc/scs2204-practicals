package p7

def filterPrime(list: List[Int]) = 
    list.filter(i => i match 
        case x if x <= 1 => false
        case 2 => true
        case x => (2 to x-1).forall(x % _ != 0)
    )

@main def q3() =
    val numbers = (-50 to 50).toList
    println(filterPrime(numbers))