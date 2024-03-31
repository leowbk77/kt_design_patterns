package state.concreteState

import state.state
import state.context

class GoldenState(account: Account) : State(account) {
    
    //constructor(account: Account) : super(account)

    override fun setLimits() {
        super.inferiorLimit = 1000.0
        super.superiorLimit = 10000000.0
        super.stateType = "gold"
    }

    override fun stateChangeVerify(){
        if (super.account.balance < 0.0) {
            super.account.state = RedState(super.account)
        } else if (super.account.balance < super.inferiorLimit) {
            super.account.state = SilverState(super.account)
        }
    }

    override fun deposit(value: Double) {
        super.account.balance = super.account.balance + (value * 1.01)
    }
}