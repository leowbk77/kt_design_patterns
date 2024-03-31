package state.state

import state.context

open abstract class State {
    val account: Account
    var inferiorLimit: Double
    var superiorLimit: Double
    var stateType: String

    constructor(account: Account) {
        this.account = account
        this.inferiorLimit = 0.0
        this.superiorLimit = 0.0
        this.stateType = ""
        setLimits()
    }

    open protected abstract fun setLimits()
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