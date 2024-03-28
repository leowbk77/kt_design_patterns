package state.concreteState

import state.state
import state.context

class GoldenState(account: Account, 
                  inferiorLimit: Double = 1000.0,
                  superiorLimit: Double = 10000000.0,
                  val stateType: String = "gold") : State(account, inferiorLimit, superiorLimit) {
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