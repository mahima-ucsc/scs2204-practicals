package p5

def fibonacci(n: Int) : Int = n match
    case x if x > 2 => fibonacci(n -2) + fibonacci( n -1)
    case _ => n

def fibSequence(n: Int) : String = n match
    case x if x != 1 => fibSequence(n -1) + " " + fibonacci(n-1)
    case _ => "0"


@main def q3() =
    println(fibSequence(7));