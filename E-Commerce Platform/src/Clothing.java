public class Clothing extends Product {
    private String size;
    private String material;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void get_product_details() {
        System.out.println("This product is Clothing.");
    }
}
