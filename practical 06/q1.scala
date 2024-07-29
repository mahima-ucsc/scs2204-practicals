package p6

type Product = Map[String, String | Int]
type Inventory = Map[Int, Product]

def productNames(inventory: Inventory) =
    inventory.values.map(product => product("name"))

def inventoryTotalValue(inventory: Inventory) =
    inventory.values.map { product => 
        product("price").asInstanceOf[Int] * product("quantity").asInstanceOf[Int]}
        .reduceOption(_ + _)
    match 
        case None => 0
        case Some(v) => v
        
def isInventoryEmpty(inventory: Inventory) =
        inventory.values.forall(p => p("quantity") == 0)

def mergeInventories(inv1: Inventory, inv2: Inventory) =
    inv1.foldLeft(inv2) { 
        case(inventory2, (id, p1)) =>
            inventory2.get(id) match 
                case None => inventory2 + (id -> p1)
                case Some(p2) => 
                    inventory2 + (id -> (
                        p1 
                        + ("price" -> Math.max(p1("price").asInstanceOf[Int], p2("price").asInstanceOf[Int]))
                        + ("quantity" -> (p1("quantity").asInstanceOf[Int] +  p2("quantity").asInstanceOf[Int]))
                    ))
    }

def printProductDetails(inventory: Inventory, productId: Int) =
    inventory.get(productId) match
        case Some(product) => 
            println(s"Product Id: ${productId}")
            println(s"Product Name: ${product("name")}")
            println(s"Product quantity: ${product("quantity")}")
            println(s"Product price: ${product("price")}")
        case None => println("No product found")

@main def q1() =
    val inventory1: Inventory = Map(
        101 -> Map("name" -> "Chocolate Biscuit", "price" -> 120, "quantity" -> 50),
        102 -> Map("name" -> "Pebbles", "price" -> 50, "quantity" -> 300),
        103 -> Map("name" -> "Bubble Gum", "price" -> 50, "quantity" -> 100),
    )

    val inventory2: Inventory = Map(
        102 -> Map("name" -> "Pebbles", "price" -> 40, "quantity" -> 400),
        104 -> Map("name" -> "Oreo", "price" -> 700, "quantity" -> 50),
        105 -> Map("name" -> "Ice Cream" , "price" -> 400, "quantity" -> 100),
    )

    println("Product names for inventory 1: ")
    productNames(inventory1).foreach(println)
    println()

    println(s"Total value of all product of inventory 1: ${inventoryTotalValue(inventory1)}")
    println()

    println(s"isInventory1Empty: ${isInventoryEmpty(inventory = inventory1 )}")
    println()

    val inventory3 = mergeInventories(inventory1, inventory2)
    println(inventory3)
    println()

    printProductDetails(inventory1, 102)
    printProductDetails(inventory1, 169)
    printProductDetails(Map(), 169)
    