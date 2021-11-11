package Store;

import java.util.ArrayList;
import java.util.List;

class Store {
    List<FlowerBucket> buckets;

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(Flower flower) {
        List<FlowerBucket> findBuckets = new ArrayList<>();
        for (FlowerBucket bucket: buckets) {
            for (FlowerPack pack: bucket.getPacks()) {
                if (pack.flower.equals(flower)) {
                    findBuckets.add(bucket);
                    break;
                }
            }
        }
        return findBuckets;
    }
}