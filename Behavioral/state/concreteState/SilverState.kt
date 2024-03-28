package state.concreteState

import state.state
import state.context

class SilverState(account: Account, 
                  inferiorLimit: Double = 0.0,
                  superiorLimit: Double = 1000.0,
                  val stateType: String = "silver") : State(account, inferiorLimit, superiorLimit) {
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