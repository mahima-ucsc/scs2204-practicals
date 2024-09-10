package p10

class Account {
  private var balance: Double = 0
  def deposit(amount: Double): Unit =
    balance += amount
  def withdraw(amount: Double): Unit =
    balance -= amount
  def transfer(amount: Double, to: Account): Unit =
    this.withdraw(amount)
    to.deposit(amount)
  def getBalance: Double =
    balance

  override def toString(): String = s"Account balance: $balance"
}

@main def q3() =
  var account1 = Account()
  account1.deposit(2000)
  var account2 = Account()
  account2.deposit(6000)

  println("Before transfer:")
  println("Account 1 balance: " + account1.getBalance)
  println("Account 2 balance: " + account2.getBalance)

  account1.transfer(500, account2)

  println("\nAfter transfer: (transfer 500 from Account 1 to Account 2)")
  println("Account 1 balance: " + account1.getBalance)
  println("Account 2 balance: " + account2.getBalance)
