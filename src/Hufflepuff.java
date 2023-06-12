public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic,
                      int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void print(Hufflepuff[] hufflepuffs){
        System.out.println("Количество учеников в Пуффендуе "+hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя "+hufflepuff.getName()+"; Фамилия "+hufflepuff.getSurname()
                    +"; Магическая сила "+hufflepuff.getPowerOfMagic()+"; Расстояние трансгрессии "+hufflepuff.getTransgression()+
                    "; Трудолюбие "+ hufflepuff.getIndustriousness()+
                    "; Верность "+ hufflepuff.getLoyalty()+"; Честность "+hufflepuff.getHonesty());

        }
    }
    public int superPower(){
        return industriousness+loyalty+honesty;
    }
    public void compare1(Hufflepuff hufflepuff) {
        int a=superPower();
        int b = hufflepuff.superPower();

        if (a>b){
            System.out.println(getName()+" лучше Пуффендуец, чем " + hufflepuff.getName());
        }
        if (b>a){
            System.out.println(hufflepuff.getName()+" лучше Пуффендуец, чем " + getName());
        }
    }
}
