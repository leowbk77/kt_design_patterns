package state.concreteState

import state.state
import state.context

class RedState(account: Account, 
               inferiorLimit: Double = -100.0,
               superiorLimit: Double = 0.0,
               val stateType: String = "red") : State(account, inferiorLimit, superiorLimit) {
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