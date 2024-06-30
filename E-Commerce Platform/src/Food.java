public class Food extends Product {
    private String expiration_date;
    private String organic;

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getOrganic() {
        return organic;
    }

    public void setOrganic(String organic) {
        this.organic = organic;
    }

    public void get_product_details() {
        System.out.println("This product is Food.");
    }
}
