package p5

case class Book(title: String, author: String, isbn: String);

def addBook(books: Set[Book], newBook: Book): Set[Book] = 
    books + newBook

def removeBook(books: Set[Book], isbn: String): Set[Book] = 
    books.filterNot(_.isbn == isbn)

def hasBook(books: Set[Book], isbn: String): Boolean = 
    books.exists(_.isbn == isbn)

def displayLibrary(books: Set[Book]): Unit = 
    books.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))

def searchBookByTitle(books: Set[Book], title: String): Option[Book] =
    books.find(_.title == title)

def displayBooksByAuthor(books: Set[Book], author: String): Unit = {
    val authorBooks = books.filter(_.author == author)
    if (authorBooks.isEmpty) {  
        println(s"No books found by author: $author")
    } else {
        println(s"Books by author: $author")
        authorBooks.foreach(book => println(s"${book.title} (ISBN: ${book.isbn})"))
    }
}

@main def q2():  Unit = 
    var books = Set(
        Book("Janadhipathi Thaththa", "Chathurika Sirisena", "123456"),
        Book("The Conspiracy to Oust Me from the Presidency", "Gotabaya Rajapaksa", "789012"),
        Book("Sri Lanka: The Emerging Wonder of Asia", "Ajith Nivard Cabraal", "345678"),
        Book("The Great Bondscam Cover-up", "Ajith Nivard Cabraal", "987654")
    )

    displayLibrary(books);
    println()

    val newBook = Book("Chaura Rajina", "Victor Ivan", "234567")
    books = addBook(books, newBook)

    displayLibrary(books);
    println()

    books = removeBook(books, "123456")

    displayLibrary(books);
    println()

    displayBooksByAuthor(books, "Ajith Nivard Cabraal")
    println()



