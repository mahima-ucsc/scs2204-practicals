package p8

@main def q2() = 
    val isMultipleOfThree: Int => Boolean = _ % 3 == 0
    val isMultipleOfFive: Int => Boolean = _ % 5 == 0

    println("Enter an integer: ")
    scala.io.StdIn.readInt() match 
        case x if isMultipleOfThree(x) && isMultipleOfFive(x) => println("Multiple of Both Three and Five")
        case x if isMultipleOfThree(x) => println("Multiple of Three")
        case x if isMultipleOfFive(x) => println("Multiple of Five")
        case _ => println("Not a Multiple of Three or Five")


