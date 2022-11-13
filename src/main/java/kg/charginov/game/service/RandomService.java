package kg.charginov.game.service;

import java.util.Random;

public class RandomService {
    public static int randomInt(){
        Random r = new Random();
        return r.nextInt(50);
    }
}
