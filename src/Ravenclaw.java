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
        public void compare1(Ravenclaw[] ravenclaws,String name1,String name2) {
        int a=0;
        int b = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (name1.equals(ravenclaw.getName())){
                a= ravenclaw.getIntellect()+ ravenclaw.getSapience()+ ravenclaw.getWittiness()+ ravenclaw.getCreation();
            }
            if (name2.equals(ravenclaw.getName())){
                b=ravenclaw.getIntellect()+ ravenclaw.getSapience()+ ravenclaw.getWittiness()+ ravenclaw.getCreation();
            }
        }
        if (a>b){
            System.out.println(name1+" лучше Когтевранец, чем " + name2);
        }
        if (b>a){
            System.out.println(name2+" лучше Когтевранец, чем " + name1);
        }
    }
}
