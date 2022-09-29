package module5.part5;

import java.util.Set;

public class Builder {
    private Set<Flower> flower;
    private Set<PackageEnum> packageEnums;

    public Builder builderFlower(Set<Flower> flower) {
        this.flower = flower;
        return this;
    }

    public Builder builderPackageEnums(Set<PackageEnum> packageEnums) {
        this.packageEnums = packageEnums;
        return this;
    }

    public FlowerComposition build() {
        FlowerComposition flowerComposition = new FlowerComposition();
        flowerComposition.setFlower(flower);
        flowerComposition.setPackageEnums(packageEnums);
        return flowerComposition;
    }
}
