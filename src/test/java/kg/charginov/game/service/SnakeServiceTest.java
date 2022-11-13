package kg.charginov.game.service;

import junit.framework.TestCase;
import kg.charginov.game.model.Snake;
import kg.charginov.game.service.impl.SnakeServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SnakeServiceTest {

    private SnakeService service;

    @Before
    public void setUp() throws Exception {
        this.service = new SnakeServiceImpl();
    }

    @Test
    public void testEatDot_should_return_true() {
        Snake snake = new Snake();
        int snakeSize = snake.getSize();
        Assert.assertEquals(snakeSize + 1, service.eatDot(snake).getSize());
    }

    @Test
    public void testMoveRight_should_throw(){
        Snake snake = new Snake();
        snake.getHead().setX(50);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.moveRight(snake),
                "Должна была быть ошибка, когда змейка пересечет границы сетки"
        );
    }

    @Test
    public void testMoveLeft_should_throw(){
        Snake snake = new Snake();
        snake.getHead().setY(50);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.moveLeft(snake),
                "Должна была быть ошибка, когда змейка пересечет границы сетки"
        );
    }

}