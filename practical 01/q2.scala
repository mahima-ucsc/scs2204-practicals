package p1

def celciusToFahrenheit(c: Double) = 1.8 * c + 32d

@main def convertTemperature() = println(s"35 Celcius = ${celciusToFahrenheit(35)} Fahrenheit")