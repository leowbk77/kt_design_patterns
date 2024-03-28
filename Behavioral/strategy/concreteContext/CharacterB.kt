package strategy.concreteContext

import strategy.context.Character
import strategy.concreteStrategy.Atack1

class CharacterB(atackConcrete: Atack = Atack1()) : Character(atackConcrete) {
}