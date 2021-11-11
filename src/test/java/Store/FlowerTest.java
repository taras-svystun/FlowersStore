package Store;

import Store.Flower;
import Store.FlowerColor;
import Store.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    Flower flower = new Flower(FlowerType.Tulip, 10, 45, FlowerColor.Pink);
    @BeforeEach
    void setUp() {

    }

    @Test
    void testToString() {
        assertEquals("Pink Tulip, sepal length=10.0, price=45.0", flower.toString());
    }

    @Test
    void getPrice() {
        assertEquals(45, flower.getPrice());
    }
}