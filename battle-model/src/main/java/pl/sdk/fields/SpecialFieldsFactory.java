package pl.sdk.fields;

import pl.sdk.MoveType;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;

public class SpecialFieldsFactory {

    public static DamageField createDamageField(int damage, int turns, MoveType moveType){
        return new DamageField(damage, turns, moveType);
    }

//    public static SpellField createSpellField(Spell spell, int turns){
//        return new SpellField(spell, turns);
//    }

    public static ObstacleField createObstacleField(int turns){
        return new ObstacleField(turns);
    }

    public static Creature createDestructibleField(int hp) {
        return NecropolisFactory.createDefaultForTests();
    }

}
