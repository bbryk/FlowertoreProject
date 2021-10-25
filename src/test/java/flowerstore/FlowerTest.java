package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setSepalLength(12.5);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }
    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }
    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(12.5, flower.getSepalLength()); //w
    }
}