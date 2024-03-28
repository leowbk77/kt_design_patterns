package strategy.context

import strategy.strategy.Atack

open abstract class Character(val atackConcrete: Atack) {
    fun atack(){
        atackConcrete.atack()
    }
}