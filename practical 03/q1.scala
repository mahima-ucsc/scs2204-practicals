package p3

def reversedString(str: String): String = str.length() match
    case 0 => ""
    case strLength => s"${str.charAt(strLength - 1)}${reversedString(str.substring(0, strLength - 1))}"


@main def q1() = 
    val str = "mahima"
    println(s"Reversed string = ${reversedString(str)}")