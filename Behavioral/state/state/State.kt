package state.state

import state.context

// necessita correção
open abstract class State(val account: Account,
                          var inferiorLimit: Double,
                          var superiorLimit: Double,
                          val stateType: String) { // <-------------
    //open protected abstract fun setLimits() <------
    open abstract fun stateChangeVerify()

    open fun deposit(value: Double) {
        account.balance = account.balance + value
        stateChangeVerify()
    }

    open fun withdraw(value: Double) {
        account.balance = account.balance - value
        stateChangeVerify()
    }
}