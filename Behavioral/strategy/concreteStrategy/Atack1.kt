package strategy.concreteStrategy

import strategy.strategy.Atack

class Atack1 : Atack() {
    override fun atack() {
        println("Atack type 1")
    }
}