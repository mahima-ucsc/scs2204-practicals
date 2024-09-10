package p10

class Bank {
  private var accounts = List[Account]()

  def addAccount(acc: Account): Unit =
    accounts = acc :: accounts

  def negativeBalanceAccounts: List[Account] =
    accounts.filter(_.getBalance < 0)

  def totalBalance: Double =
    accounts.map(_.getBalance).sum

  def applyInterest(): Unit =
    accounts.foreach((acc) => {
      if (acc.getBalance >= 0) {
        acc.deposit(acc.getBalance * 0.05)
      } else {
        acc.deposit(acc.getBalance * 0.10)
      }
    })

  def totalBalanceWithInterest: Double =
    applyInterest()
    accounts.map(_.getBalance).sum

  override def toString: String =
    accounts.toString()

}

@main def q4() =
  var account1 = Account()
  account1.deposit(2000)
  var account2 = Account()
  account2.deposit(6000)

  account1.deposit(1000)
  account2.withdraw(10000)
  val bank = Bank()
  bank.addAccount(account1)
  bank.addAccount(account2)

  println("Accounts: " + bank)
  println("\nNegative balance accounts: " + bank.negativeBalanceAccounts)
  println("Total balance: " + bank.totalBalance)
  println("Total balance with interest: " + bank.totalBalanceWithInterest)
  println("Accounts after interest: " + bank)
