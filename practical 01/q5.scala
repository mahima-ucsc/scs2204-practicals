def easyPaceTime(d: Int) = 8 * d
def fastPaceTime(d: Int) = 7 * d
def totalTime(d1: Int, d2: Int, d3: Int) = easyPaceTime(d1) + fastPaceTime(d2) + easyPaceTime(d3)

@main def totalRunnigTime = println(s"Total Running Time: ${totalTime(2, 3, 2)}")