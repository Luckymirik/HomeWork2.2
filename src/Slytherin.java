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
    public void compare1(Slytherin[] slytherins,String name1,String name2) {
        int a=0;
        int b = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            if (name1.equals(slytherin.getName())){
                a=slytherin.getCunning()+slytherin.getDetermination()+slytherin.getAmbition()+
                        slytherin.getResourcefulness()+slytherin.getLustForPower();
            }
            if (name2.equals(slytherin.getName())){
                b=slytherin.getCunning()+slytherin.getDetermination()+slytherin.getAmbition()+
                        slytherin.getResourcefulness()+slytherin.getLustForPower();
            }
        }
        if (a>b){
            System.out.println(name1+" лучше Слизеринец, чем " + name2);
        }
        if (b>a){
            System.out.println(name2+" лучше Слизеринец, чем " + name1);
        }
    }
}
