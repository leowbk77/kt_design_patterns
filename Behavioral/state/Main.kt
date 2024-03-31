package state

class Main {
    fun main(){
        val conta = Account("00001")
        conta.deposit(500.0)
        conta.acc_info()    
        conta.deposit(300.0)
        conta.acc_info()    
        conta.deposit(550.0)
        conta.acc_info()    
        conta.deposit(550.0)
        conta.acc_info()
        conta.withdraw(2000.0)
        conta.acc_info()
        conta.withdraw(1100.0)
        conta.acc_info()
    }
}