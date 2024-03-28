package strategy.concreteStrategy

import strategy.strategy.Atack

class Atack2 : Atack() {
    override fun atack() {
        println("Atack type 2")
    }
}