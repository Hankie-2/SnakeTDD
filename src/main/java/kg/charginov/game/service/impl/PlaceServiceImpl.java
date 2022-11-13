package kg.charginov.game.service.impl;

import kg.charginov.game.model.Dot;
import kg.charginov.game.model.Food;
import kg.charginov.game.model.Place;
import kg.charginov.game.model.Snake;
import kg.charginov.game.service.PlaceService;
import kg.charginov.game.service.RandomService;

import java.util.Random;

public class PlaceServiceImpl implements PlaceService {
    @Override
    public Place createPlace() {
        Food food = new Food();
        Snake snake = new Snake();

        if(food.getDot().getX()==snake.getHead().getX() && food.getDot().getY()==snake.getHead().getY()){
            throw new IllegalArgumentException();
        }

        return new Place(food,snake);
    }
}
