package p3

def filteredList(list: List[String]) =
        list.filter(str => str.length() > 5)

@main def q2() = 
    val strList = List("mahima", "str", "", "longlonglongstring")
    println(filteredList(strList))