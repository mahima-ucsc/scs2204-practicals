package p6

def getStudentInfo(): (String, Int, Int) = 
    println("Enter students name: ");
    val name = scala.io.StdIn.readLine();

    println("Enter marks : ")
    val marks = scala.io.StdIn.readInt();

    println("Enter total possible mark: ")
    val totalPossibleMark = scala.io.StdIn.readInt()

    (name, marks, totalPossibleMark)

def validateInput(name: String, marks: Int, totalPossibleMark: Int): (Boolean, Option[String]) = 
    name.trim() match 
        case "" => (false, Option("Name cannot be empty"))
        case _ => 
            marks match
                case x if x < 0 => (false, Option("Marks cannot be negative"))
                case x if x > totalPossibleMark => (false, Option("Marks cannot exceed total possible marks"))
                case _ =>
                    (true, None)
    
def printStudentRecord(t: Tuple) = println(t)

def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) =
    val stuInfo = getStudentInfo()
    (validateInput.tupled(stuInfo) : @unchecked) match 
        case (true, None)  => 
            (stuInfo._2 / stuInfo._3.toDouble ) match 
                case x if x >= 0.90 => 
                    (stuInfo._1, stuInfo._2, stuInfo._3, x * 100, 'A')
                case x if x >= 0.75 => 
                    (stuInfo._1, stuInfo._2, stuInfo._3, x * 100, 'B')
                case x if x >= 0.50 => 
                    (stuInfo._1, stuInfo._2, stuInfo._3, x * 100, 'C')
                case x =>
                    (stuInfo._1, stuInfo._2, stuInfo._3, x * 100, 'D')

        case (false, Some(x)) =>
            println(x)
            getStudentInfoWithRetry()

@main def q1() =
    printStudentRecord(getStudentInfoWithRetry())
