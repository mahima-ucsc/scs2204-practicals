package p9

def checkInt(num: Int) = num match
    case x if x <= 0 => println("Negative/Zero")
    case x if x % 2 == 0 => println("Even number")
    case _ => println("Odd number")

@main def q2() = 
    println("Enter an Int: ")
    val num = scala.io.StdIn.readInt()

    checkInt(num)