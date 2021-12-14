package pl.sdk.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdk.GameEngine;
import pl.sdk.MoveType;
import pl.sdk.Point;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SpecialFieldTest {

    private GameEngine engine;
    private Creature creature;
    @BeforeEach
    void init(){
        creature = NecropolisFactory.createDefaultForTests();
        engine = new GameEngine(new ArrayList<>(List.of(creature)), Collections.emptyList());
    }

    @Test
    void shouldFieldBePutOnBoard(){
        SpecialField field = SpecialFieldsFactory.createObstacleField(15);


        engine.insertSpecialFieldToBoard(new Point(1,3), field);

        assertEquals(field, engine.getField(1, 3));

    }

    @Test
    void shouldCreatureStepOnDamageField() {

        engine.insertSpecialFieldToBoard(new Point(5,5), SpecialFieldsFactory.createDamageField(5, 5, MoveType.FLYING));

        SpecialField field = engine.getField(5,5);

        int prevHp = engine.getActiveCreature().getCurrentHp();

        field.triggerEffect(engine.getActiveCreature());

        int afterHp = engine.getActiveCreature().getCurrentHp();

        assertEquals(afterHp, prevHp - 5);
    }
        @Test
    void shouldCreatureMoveToFieldWithObstacle() {

        engine.insertSpecialFieldToBoard(new Point(1,2), SpecialFieldsFactory.createObstacleField(5));

        boolean canMove = engine.canMove(1, 2);

        assertFalse(canMove);

    }

    //    @Test
//    void shouldLandCreatureStepOnDamageField() {
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createDamageField(5, MoveType.WALKING));
//
//        SpecialField field = engine.getField(new Point(5,5));
//
//        int prevHp = engine.getActiveCreature().getCurrentHp();
//
//        field.triggerEffect(engine.getActiveCreature());
//
//        int afterHp = engine.getActiveCreature().getCurrentHp();
//
//        assertEquals(prevHp - 5, afterHp);
//
//    }
//
//    @Test
//    void shouldCreatureMoveToImpassableField() {
//
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createImpassableField());
//
//        boolean canMove = engine.canMove(5, 5);
//
//        assertFalse(canMove);
//
//    }
//
//    @Test
//    void shouldCreatureAttackDestructibleField() {
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createDestructibleField(3));
//
//        SpecialField field = engine.getField(new Point(5,5));
//
//        assertEquals(field.getHp(), 3);
//
//        int atk = engine.getActiveCreature().getAttack();
//
//        engine.getActiveCreature.attack(field.getObstacle());
//
//        assertEquals(field.getHp(), 3 - atk);
//
//    }
//
//    @Test
//    void shouldFlyingCreatureStepOnDamageField() {
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createDamageField(5, MoveType.FLYING));
//
//        SpecialField field = engine.getField(new Point(5,5));
//
//        int prevHp = engine.getActiveCreature().getCurrentHp();
//
//        field.triggerEffect(engine.getActiveCreature());
//
//        int afterHp = engine.getActiveCreature().getCurrentHp();
//
//        assertEquals(afterHp, prevHp - 5);
//
//    }
//    @Test
//    void shouldLandCreatureStepOnDamageField() {
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createDamageField(5, MoveType.WALKING));
//
//        SpecialField field = engine.getField(new Point(5,5));
//
//        int prevHp = engine.getActiveCreature().getCurrentHp();
//
//        field.triggerEffect(engine.getActiveCreature());
//
//        int afterHp = engine.getActiveCreature().getCurrentHp();
//
//        assertEquals(prevHp - 5, afterHp);
//
//    }
//    @Test
//    void shouldCreatureStepOnBuff() {
//
//        Spell spell = SpellFactory.createSpeedBuff();
//
//        engine.createSpecialField(new Point(5,5), SpecialFieldFactory.createStatField(spell));
//
//        SpecialField field = engine.getField(new Point(5,5));
//
//        int range = engine.getActiveCreature().getMoveRange();
//
//        field.triggerEffect(engine.getActiveCreature());
//
//        int buffedRange = engine.getActiveCreature().getMoveRange();
//
//        assertEquals(range*2, buffedRange);
//
//    }


}