public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int sapience;
    private int wittiness;
    private int creation;

    public Ravenclaw(String name, String surname, int powerOfMagic,
                     int transgression, int intellect, int sapience, int wittiness, int creation) {
        super(name, surname, powerOfMagic, transgression);
        this.intellect = intellect;
        this.sapience = sapience;
        this.wittiness = wittiness;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getSapience() {
        return sapience;
    }

    public void setSapience(int sapience) {
        this.sapience = sapience;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
