package p4

def printItems(items: Array[String], quantity: Array[Int]): Unit = {
  items match {
    case Array() => ()
    case _ => {
      println(items.head + "\t" + quantity.head);
      printItems(items.tail, quantity.tail);
    }
  }
}

def displayInventory(): Unit = {
  println("Item\tQuantity");
  printItems(items, quantities);
}

def restockItem(item: String, quantity: Int): Unit = {
  val index = items.indexOf(item);
  if (index != -1) {
    quantities(index) += quantity;
    println(item + " has been restocked with " + quantity);
  } else {
    println(item + " not found in inventory");
  }
}

def sellItem(item: String, quantity: Int): Unit = {
  val index = items.indexOf(item);
  if (index != -1) {
    if (quantities(index) < quantity) {
      println("quantity is not enough to sell for item " + item);
    } else {
      quantities(index) -= quantity;
      println("sold " + quantity + " " + item);
    }
  } else {
    println(item + " not found in inventory");
  }
}

val items: Array[String] = Array("Apple", "Banana", "Orange", "Grapes", "Guava")
val quantities: Array[Int] = Array(10, 20, 30, 40, 50)

@main def q1() =
    println("==== Before restocking ====\n")
    displayInventory();
    println();

    restockItem("Orange", 4);
    restockItem("Pears", 10);

    println("\n==== After restocking ====\n");
    displayInventory();
    println();

    sellItem("Banana", 8);
    sellItem("Apple", 30);
    sellItem("Pears", 20);

    println("\n==== After selling ====\n");
    displayInventory();
    