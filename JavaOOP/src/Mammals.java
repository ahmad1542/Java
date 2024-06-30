public class Mammals extends Animal{
    private String hair;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Mammals(String name, int age, String sound, String hair) {
        super(name, age, sound);
        this.hair = hair;
    }

    public void info() {
        super.info();
        System.out.println("Hair = " + hair);
    }
}
