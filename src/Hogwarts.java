public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
