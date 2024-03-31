package state.context

import state.concreteState

class Account {
    var state: State
    var number: String
    var balance: Double
    
    constructor(number: String) {
        this.state = SilverState(this) //default
        this.number = number
        this.balance = 0.0
    }
    
    fun acc_info() {
        println(number + " // balance: " + balance + " // state: " + state.stateType)
    }

    fun deposit(value: Double) {
        state.deposit(value)
    }

    fun withdraw(value: Double) {
        state.withdraw(value)
    }
}