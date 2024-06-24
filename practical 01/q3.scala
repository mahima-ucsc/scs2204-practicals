package p1

import scala.math.* 

def volume(r: Double) = 4 / 3d * Pi * pow(r, 3)

@main def calculateVolume = println(s"Volume of a sphere with radius of 5: ${volume(5)}")