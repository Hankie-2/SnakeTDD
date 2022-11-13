package kg.charginov.game.model;

import java.util.Arrays;

public class Place {

    private Food food;

    private Snake snake;

    private final int height = 50;
    private final int width = 50;

    public Place(Food food, Snake snake) {
        this.food = food;
        this.snake = snake;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    @Override
    public String toString() {
        return "Place{" +
                "food=" + food +
                ", snake=" + snake +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
