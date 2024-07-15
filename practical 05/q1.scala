package p5

def getProductList() : List[String]=
    println("Enter product name: ")
    val input = scala.io.StdIn.readLine()

    input match
        case "" => 
            println("Product Name Cannot be Empty.")
            getProductList()
        case x if x.toLowerCase() == "done" => 
            Nil
        case _ => 
            input :: getProductList()
        
def printProductList(productList : List[String]) : Unit =
    def helper(productList : List[String], indexFromOne : Int): Unit =
        productList match
            case  Nil => ()
            case _ =>
                println(s"$indexFromOne: ${productList.head}")
                helper(productList.tail, indexFromOne + 1)

    helper(productList, 1)

def getToatalProducts(productList: List[String]) : Int =
    productList match 
        case Nil => 0
        case _ => 1 + getToatalProducts(productList.tail)

@main def q1() = 
    println("Enter the product list: ")
    val productList = getProductList()

    println("\n=== Product List ===")
    printProductList(productList)

    println(s"\nTotal products: ${getToatalProducts(productList)}")