package Store;

import Store.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    Flower flower1 = new Flower(FlowerType.Tulip, 10, 45, FlowerColor.Pink);
    Flower flower2 = new Flower(FlowerType.Rose, 20, 60, FlowerColor.Red);
    FlowerPack pack1 = new FlowerPack();
    FlowerPack pack2 = new FlowerPack();

    FlowerBucket bucket = new FlowerBucket();
    @BeforeEach
    void setUp() {
        pack1.setFlower(flower1);
        pack1.setAmount(21);

        pack2.setFlower(flower2);
        pack2.setAmount(20);

        bucket.add(pack1);
        bucket.add(pack2);
    }

    @Test
    void getPrice() {
        assertEquals(2145, bucket.getPrice());
    }
}