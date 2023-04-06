package ch16.generic2;

public class ThreeDPrinterGeneric<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
