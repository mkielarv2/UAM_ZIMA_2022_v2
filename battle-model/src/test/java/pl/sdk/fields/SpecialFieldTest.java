package pl.sdk.fields;

import org.junit.jupiter.api.Test;
import pl.sdk.GameEngine;
import pl.sdk.Point;
import pl.sdk.creatures.Creature;
import pl.sdk.creatures.NecropolisFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpecialFieldTest {
    @Test
    void shouldCreatureMoveToImpassableField() {
        Creature creature = NecropolisFactory.createDefaultForTests();
        Creature creature2 = NecropolisFactory.createDefaultForTests();
        GameEngine engine = new GameEngine(new ArrayList<>(List.of(creature)), Collections.emptyList());

        GameEngine.createSpecialField(new Point(5,5), SpecialFieldFactory.createImpassableField());

        boolean canMove = engine.canMove(5, 5);

        assertFalse(canMove);

    }

}