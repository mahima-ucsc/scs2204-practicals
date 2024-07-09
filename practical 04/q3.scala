package p4

def toUpper(str: String): String = str.toUpperCase()
def toLower(str: String): String = str.toLowerCase()
def formatNames(f: String => String, str: String) = f(str)

@main def q3() = 
    val name1 = "Benny"
    println(formatNames(toUpper, name1))

    val name2 = "Niroshan"
    println(s"${formatNames(toUpper, name2.substring(0, 2))}${formatNames(toLower, name2.substring(2))}")

    val name3 = "Saman"
    println(formatNames(toLower, name3))

    val name4 = "Kumara"
    println(s"${name4.substring(0, 5)}${formatNames(toUpper, name4.substring(5))}")
