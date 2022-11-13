package kg.charginov.game.service;

import kg.charginov.game.model.Snake;

public interface SnakeService {

    Snake eatDot(Snake snake);

    Snake moveRight(Snake snake);

    Snake moveLeft(Snake snake);

    boolean isGameOver(Snake snake);

}
