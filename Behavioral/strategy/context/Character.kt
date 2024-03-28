package strategy.context

import strategy.strategy.Atack

open abstract class Character(var atackConcrete: Atack) {
    fun atack(){
        atackConcrete.atack()
    }
}