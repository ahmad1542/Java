public class Fish extends Animal{
    private String fins;

    public String getFins() {
        return fins;
    }

    public void setFins(String fins) {
        this.fins = fins;
    }

    public Fish(String name, int age, String sound, String fins) {
        super(name, age, sound);
        this.fins = fins;
    }

    public void info() {
        super.info();
        System.out.println("Fins = " + fins);
    }
}
