package p3

def average(num1: Int, num2: Int) : Float = 
    "%.2f".format((num1 + num2)/2f).toFloat


@main def q3() = 
    println(s"(1 + 2)/2 = ${average(1, 2)}")