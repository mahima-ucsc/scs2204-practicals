package p2

def payForWorkingHours(hours: Float) = 
    hours * 250

def payForOT(hours: Float) = 
    hours * 85

def payAfterTax(pay: Float) = 
    val taxPercentage = 0.12
    pay * (1 - taxPercentage)

def takeHome(workingHours: Float, otHours: Float) =
    payAfterTax(payForWorkingHours(workingHours) + payForOT(otHours))

@main def question3() = 
    println(s"Pay for typical employee: ${takeHome(40, 30)}")