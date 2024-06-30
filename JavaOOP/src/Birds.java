public class Birds extends Animal{
    private String flight;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Birds(String name, int age, String sound, String flight) {
        super(name, age, sound);
        this.flight = flight;
    }

    public void info() {
        super.info();
        System.out.println("Flight = " + flight);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "flight='" + flight + '\'' +
                "} " + super.toString();
    }
}
