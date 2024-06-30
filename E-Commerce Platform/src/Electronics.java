public class Electronics extends Product {
    private String brand;
    private int warranty_period;

    public int getWarranty_period() {
        return warranty_period;
    }

    public void setWarranty_period(int warranty_period) {
        this.warranty_period = warranty_period;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void get_product_details() {
        System.out.println("This product is electronic.");
    }
}
