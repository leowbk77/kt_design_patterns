package state.concreteState

import state.state
import state.context

class SilverState(account: Account) : State(account) {

    //constructor(account: Account) : super(account)

    override fun setLimits() {
        super.inferiorLimit = 0.0
        super.superiorLimit = 1000.0
        super.stateType = "silver"
    }

    override fun stateChangeVerify(){
        if (super.account.balance < super.inferiorLimit) {
            super.account.state = RedState(super.account)
        } else if (super.account.balance > super.superiorLimit) {
            super.account.state = GoldenState(super.account)
        }
    }

    override fun withdraw(value: Double) {
        super.account.balance = super.account.balance - value - 5.00
        stateChangeVerify()
    }
}