package strategy.concreteContext

import strategy.context.Character
import strategy.concreteStrategy.Atack2

class CharacterA(atackConcrete: Atack = Atack2()) : Character(atackConcrete) {
}