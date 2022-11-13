package kg.charginov.game.model;

import kg.charginov.game.service.RandomService;

public class Food {

    private Dot dot;

    public Food() {
        this.dot = new Dot(RandomService.randomInt(),RandomService.randomInt());
    }


    public Dot getDot() {
        return dot;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

    @Override
    public String toString() {
        return "Food{" +
                "dot=" + dot +
                '}';
    }
}
