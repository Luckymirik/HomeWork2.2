public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgression,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void print(Slytherin[] slytherins){
        System.out.println("Количество учеников в Слизнрине "+slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя "+slytherin.getName()+"; Фамилия "+slytherin.getSurname()
                    +"; Магическая сила "+slytherin.getPowerOfMagic()+"; Расстояние трансгрессии "+slytherin.getTransgression()+
                    "; Хитрость "+ slytherin.getCunning()+
                    "; Решительность "+ slytherin.getDetermination()+"; Амбициозность ;"+slytherin.getAmbition()+
                    "; Находчивость "+slytherin.getResourcefulness()+"; Жажда власти "+slytherin.getLustForPower());

        }
    }
    public int superPower(){
        return cunning + determination+ ambition +resourcefulness+lustForPower;
    }
    public  void compare1(Slytherin slytherin) {
        int a=superPower();
        int b = slytherin.superPower();
        if (a>b){
            System.out.println(getName()+" лучше Слизеринец, чем " + slytherin.getName());
        }
        if (b>a){
            System.out.println(slytherin.getName()+" лучше Слизеринец, чем " + getName());
        }
    }
}
