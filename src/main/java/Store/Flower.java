package Store;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private FlowerColor flowerColor;
    private double sepalLength;
    private double price;

    public Flower(FlowerType type, int sepalLength, int price, FlowerColor color) {
        this.flowerType = type;
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerColor = color;
    }

    @Override
    public String toString(){
        String result = "";
        result += this.flowerColor + " " + this.flowerType.toString() + ", sepal length=";
        result += this.sepalLength + ", price=" + this.price;

        return result;
    }
}