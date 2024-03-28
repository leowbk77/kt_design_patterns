package strategy

import strategy.concreteContext
import strategy.concreteStrategy

class Main {
    fun main(){
        val character = CharacterB()
        character.atack()
        character.atackConcrete = Atack2()
        character.atack()
    }
}