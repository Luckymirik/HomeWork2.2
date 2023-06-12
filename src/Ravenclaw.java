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
    public void print(Ravenclaw[] ravenclaws){
        System.out.println("Количество учеников в Когтевране "+ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя "+ravenclaw.getName()+"; Фамилия "+ravenclaw.getSurname()
                    +"; Магическая сила "+ravenclaw.getPowerOfMagic()+"; Расстояние трансгрессии "+ravenclaw.getTransgression()+
                    "; Ум "+ ravenclaw.getIntellect()+
                    "; Мудрость "+ ravenclaw.getSapience()+"; Остроумие "+ravenclaw.getWittiness()
                    +"; Творчество "+ravenclaw.getCreation());

        }
    }
    public int superPower(){
        return intellect+sapience+wittiness+creation;
    }
        public void compare1(Ravenclaw ravenclaw) {
        int a=superPower();
        int b = ravenclaw.superPower();

            if (a>b){
                System.out.println(getName()+" лучше Когтевранец, чем " + ravenclaw.getName());
            }
            if (b>a){
                System.out.println(ravenclaw.getName()+" лучше Когтевранец, чем " + getName());
            }
    }
}
