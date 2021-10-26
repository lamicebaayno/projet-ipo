package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import util.Case;
import util.Direction;

public class Frog implements IFrog {

    private Game game;
    private Case position;
    private Direction direction;

    public Frog(Game game){
        this.game = game;
        this.position = new Case(0,0);
        this.direction = Direction.right;
    }

    @Override
    public Case getPosition() {
        return this.position;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public void move(Direction key) {
        switch (key) {
            case up -> this.position = new Case(this.position.absc, this.position.ord + 1);

            case down -> this.position = new Case(this.position.absc, this.position.ord - 1);

            case right -> this.position = new Case(this.position.absc + 1, this.position.ord);

            case left -> this.position = new Case(this.position.absc - 1, this.position.ord);

        }
    }
}
