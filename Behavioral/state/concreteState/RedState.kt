package state.concreteState

import state.state
import state.context

class RedState(account: Account) : State(account) {

    //constructor(account: Account) : super(account)

    override fun setLimits() {
        super.inferiorLimit = -100.0
        super.superiorLimit = 0.0
        super.stateType = "red"
    }

    override fun stateChangeVerify(){
        if (super.account.balance > super.superiorLimit) {
            super.account.state = SilverState(super.account)
            super.account.state.stateChangeVerify()
        }
    }

    override fun withdraw(value: Double) {
        println("No funds!")
    }
}