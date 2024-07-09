package p4

def toUpper(str: String): String = str.toUpperCase()
def toLower(str: String): String = str.toLowerCase()
def formatNames(f: String => String, str: String) = f(str)

def printFormattedNames(names: List[String]): Unit = names match
    case Nil => ()
    case _ => {
        println(names.head)
        println(formatNames(toLower, names.head))
        println(formatNames(toUpper, names.head))
        println()
        printFormattedNames(names.tail)
    }

@main def q3() = 
    val names = List("BENNY", "NIroshan", "saman", "KumarA")
    printFormattedNames(names)