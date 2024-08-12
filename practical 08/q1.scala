package p8

def caesarEncrypt(text: String, shift: Int): String = {
  text.map {
    case x if x.isLower =>  ((x - 'a' + shift % 26 + 26) % 26 + 'a').toChar
    case x if x.isUpper =>  ((x - 'A' + shift % 26 + 26) % 26 + 'A').toChar
    case x => x
  }
}

def caesarDecrypt(text: String, shift: Int): String = {
  text.map {
    case x if x.isLower =>  ((x - 'a' - shift % 26 + 26) % 26 + 'a').toChar
    case x if x.isUpper =>  ((x - 'A' - shift % 26 + 26) % 26 + 'A').toChar
    case x => x
  }
}

def cypher(encrypt: (text: String, shift: Int) => String, decrypt: (text: String, shift: Int) => String): Unit = 
    println("Select an option: ")
    println("1. Encrypt")
    println("2. Decrypt")

    scala.io.StdIn.readInt() match 
        case 1 => 
            println("Enter text to encrypt: ");
            val text = scala.io.StdIn.readLine();
            println("Enter shift value: ");
            val shift = scala.io.StdIn.readInt();
            println(s"Encrypted text: ${encrypt(text, shift)}")
        case 2 => 
            println("Enter text to decrypt: ");
            val text = scala.io.StdIn.readLine();
            println("Enter shift value: ");
            val shift = scala.io.StdIn.readInt();
            println(s"Decrypted text: ${decrypt(text, shift)}")
        case _ => 
            println("Invalid option")
            cypher(encrypt, decrypt)


@main def q1() = 
    cypher(caesarEncrypt, caesarDecrypt)
    