package p2

def attendance(ticketPrice: Int) = 180 - ticketPrice * 4

def revenue(ticketPrice: Int) = ticketPrice * attendance(ticketPrice)

def cost(ticketPrice: Int) = 500 + 3 * attendance(ticketPrice)

def profit(ticketPrice: Int) = revenue(ticketPrice) - cost(ticketPrice)

@main def question4() = 
    var ticketPrice = 0;
    while attendance(ticketPrice) >= 0
    do 
        print(s"Ticket price: ${ticketPrice} => Profit: ${profit(ticketPrice)}\n");
        ticketPrice = ticketPrice + 1;
