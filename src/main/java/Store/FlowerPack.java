package Store;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class FlowerPack {
    public Flower flower;
    int amount;

    public double getPrice(){
        return this.amount * this.flower.getPrice();
    }
}