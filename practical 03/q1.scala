package p3

def reversedString(str: String): String = str.length() match
    case 0 => ""
    case strLength => str.charAt(strLength - 1) + reversedString(str.substring(0, strLength - 1))


@main def main() = 
    val str = "mahima"
    println(s"Reversed string = ${reversedString(str)}")