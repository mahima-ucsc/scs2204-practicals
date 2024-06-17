def coverPrice(numOfCopies: Int) = numOfCopies * 24.5 * 0.6

def shippingCost(numOfCopies: Int ) = 
    if numOfCopies < 50 then numOfCopies * 3d
    else 50 * 3 + (numOfCopies - 50) * 0.75

def wholeSaleCost(numOfCopies: Int) = coverPrice(numOfCopies) + shippingCost(numOfCopies)

@main def calculateCost = println(s"Whole sale cost for 60 books: ${wholeSaleCost(60)}")