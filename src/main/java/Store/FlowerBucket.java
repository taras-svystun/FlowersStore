package Store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerBucket;

    public double getPrice(){
        double bucketPrice = 0;
        for (FlowerPack pack: flowerBucket){
            bucketPrice += pack.getPrice();
        }
        return bucketPrice;
    }

    public void add(FlowerPack pack) {
        flowerBucket.add(pack);
    }

    public FlowerBucket() {
        flowerBucket = new ArrayList<>();
    }

    public List<FlowerPack> getPacks() {
        List<FlowerPack> packs = null;
        for (FlowerPack pack: flowerBucket){
            packs.add(pack);
        }
        return packs;
    }
}