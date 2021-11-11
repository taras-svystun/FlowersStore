package Store;

import Store.Flower;
import Store.FlowerColor;
import Store.FlowerPack;
import Store.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

    private FlowerPack pack = new FlowerPack();
    Flower flower = new Flower(FlowerType.Tulip, 10, 45, FlowerColor.Pink);
    @BeforeEach
    void setUp() {
        pack.setFlower(flower);
        pack.setAmount(21);
    }

    @Test
    void getPrice() {
        assertEquals(945, pack.getPrice());
    }
}