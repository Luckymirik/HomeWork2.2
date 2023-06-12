public class Gryffindor extends Hogwarts {
    private int generosity;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgression, int generosity, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgression);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public void setGenerosity(int generosity) {
        this.generosity = generosity;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void print(Gryffindor[] gryffindors){
        System.out.println("Количество учеников в Гриффиндоре "+gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя "+gryffindor.getName()+"; Фамилия "+gryffindor.getSurname()
                    +"; Магическая сила "+gryffindor.getPowerOfMagic()+"; Расстояние трансгрессии "+gryffindor.getTransgression()+
                    "; Благородство "+ gryffindor.getGenerosity()+
                    "; Честь "+ gryffindor.getHonor()+"; Храбрость "+gryffindor.getBravery());

        }
    }
    public int superPower(){
       return generosity+honor+bravery;
    }
    public  void compare1(Gryffindor gryffindor) {
        int a=superPower();
        int b = gryffindor.superPower();


        if (a>b){
            System.out.println(getName()+" лучше Гриффиндорец, чем " + gryffindor.getName());
        }
        if (b>a){
            System.out.println(gryffindor.getName()+" лучше Гриффиндорец, чем " + getName());
        }
    }
}
