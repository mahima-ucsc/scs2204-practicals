package p9

def calculateInterest(deposit: Double): Double = deposit match {
  case x if x < 20000.00 => deposit * 0.02
  case x if x < 200000.00 => deposit * 0.04
  case x if x < 2000000.00 => deposit * 0.035
  case _ => deposit * 0.065
}

@main def q1() = 
    println("Enter the deposit amount: ")
    val num = scala.io.StdIn.readDouble()
    println("Interest: " + calculateInterest(num))