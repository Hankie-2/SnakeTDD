package kg.charginov.game.service.impl;

import kg.charginov.game.model.Snake;
import kg.charginov.game.service.SnakeService;

public class SnakeServiceImpl implements SnakeService {
    @Override
    public Snake eatDot(Snake snake) {
        if(snake.getSize()>2500){
            throw new IllegalArgumentException();
        }
        snake.eat();
        return snake;
    }

    @Override
    public Snake moveRight(Snake snake) {
        snake.getHead().setX(snake.getHead().getX()+1);
        snake.getHead().setY(snake.getHead().getY()-1);
        if(snake.getHead().getX()>50){
            throw new IllegalArgumentException();
        }
        return snake;
    }

    @Override
    public Snake moveLeft(Snake snake) {
        snake.getHead().setY(snake.getHead().getY()+1);
        snake.getHead().setX(snake.getHead().getX()-1);
        if(snake.getHead().getY()>50){
            throw new IllegalArgumentException();
        }
        return snake;
    }

    @Override
    public boolean isGameOver(Snake snake) {
        return snake.getSize()>2500;
    }

}
