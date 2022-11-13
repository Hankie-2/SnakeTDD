package kg.charginov.game.model;

import kg.charginov.game.service.RandomService;

public class Snake {

    private Dot head;

    private int size;

    public Snake() {
        this.head = new Dot(RandomService.randomInt(),RandomService.randomInt());
        this.size = 1;
    }

    public void eat(){
        this.size++;
    }

    public Dot getHead() {
        return head;
    }

    public void setHead(Dot head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
