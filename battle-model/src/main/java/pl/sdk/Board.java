package pl.sdk;

import org.checkerframework.checker.nullness.Opt;
import pl.sdk.creatures.Creature;
import pl.sdk.fields.SpecialField;
import pl.sdk.fields.SpecialFieldType;
import pl.sdk.fields.SpecialFieldsFactory;

import java.util.*;

import static pl.sdk.GameEngine.BOARD_HEIGHT;
import static pl.sdk.GameEngine.BOARD_WIDTH;

class Board {

    private final Map<Point, Creature> creaturesMap;
    private final Map<Point, SpecialField> specialFieldsMap;

    Board() {
        creaturesMap = new HashMap<>();
        specialFieldsMap = new HashMap<>();
    }

    void add(Point aPoint, Creature aCreature) {
        throwExceptionWhenIsOutsideMap(aPoint);
        throwExceptionIfTileIsTaken(aPoint);
        creaturesMap.put(aPoint, aCreature);
    }

    void addField(Point point, SpecialField specialField) {
        throwExceptionWhenIsOutsideMap(point);
        throwExceptionIfTileIsTakenByField(point);
        specialFieldsMap.put(point, specialField);
    }

    private void throwExceptionIfTileIsTaken(Point aPoint) {
        if (isTileTakenByCreature(aPoint)) {
            throw new IllegalArgumentException("Tile isn't empty");
        }
    }

    private void throwExceptionIfTileIsTakenByField(Point aPoint) {
        if (isTileTakenByField(aPoint)) {
            throw new IllegalArgumentException("Tile isn't empty");
        }
    }

    private boolean isTileTakenByCreature(Point aPoint) {
        return creaturesMap.containsKey(aPoint);
    }

    private boolean isTileTakenByField(Point aPoint) {
        return specialFieldsMap.containsKey(aPoint);
    }

    private void throwExceptionWhenIsOutsideMap(Point aPoint) {
        if (aPoint.getX() < 0 || aPoint.getX() > BOARD_WIDTH || aPoint.getY() < 0 || aPoint.getY() > BOARD_HEIGHT) {
            throw new IllegalArgumentException("You are trying to works outside the map");
        }
    }

    Creature get(int aX, int aY) {
        return creaturesMap.get(new Point(aX, aY));
    }

    SpecialField getField(int aX, int aY) {
        return specialFieldsMap.get(new Point(aX, aY));
    }

    Point get(Creature aCreature) {
        return creaturesMap.keySet().stream().filter(p -> creaturesMap.get(p).equals(aCreature)).findAny().get();
    }

    void move(Creature aCreature, Point aTargetPoint1) {
        move(get(aCreature), aTargetPoint1);
    }

    void move(Point aSourcePoint, Point aTargetPoint1) {
        throwExceptionWhenIsOutsideMap(aTargetPoint1);
        throwExceptionIfTileIsTaken(aTargetPoint1);

        Creature creatureFromSourcePoint = creaturesMap.get(aSourcePoint);
        creaturesMap.remove(aSourcePoint);
        creaturesMap.put(aTargetPoint1, creatureFromSourcePoint);
    }

    boolean canMove(Creature aCreature, int aX, int aY) {
        throwExceptionWhenIsOutsideMap(new Point(aX, aY));
        if (!creaturesMap.containsValue(aCreature)) {
            throw new IllegalStateException("Creature isn't in board");
        }
        SpecialField field = specialFieldsMap.get(new Point(aX, aY));
        if(field!= null && field.getType() == SpecialFieldType.OBSTACLE_FIELD){
            return false;
        }
        Point currentPosition = get(aCreature);
        double distance = currentPosition.distance(new Point(aX, aY));
        return distance <= aCreature.getMoveRange() && !isTileTakenByCreature(new Point(aX, aY));
    }
}
