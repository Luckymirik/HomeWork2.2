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
    public  void print(Hogwarts[] students){
        System.out.println("Количество учеников в Хогвартсе "+students.length);
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println("Имя "+hogwarts.getName()+"; Фамилия "+hogwarts.getSurname()
                    +"; Магическая сила "+hogwarts.getPowerOfMagic()+"; Расстояние трансгрессии "+hogwarts.getTransgression());

        }
    }

    public  void compare(Hogwarts students) {
        int a1=getPowerOfMagic();
        int a2=students.getPowerOfMagic();
        int b1 = getTransgression();
        int b2 =students.getTransgression();


        if (a1>a2){
            System.out.println(getName()+" обладает большей мощностью магии, чем " +students.getName() );
        }
        if (a2>a1){
            System.out.println(students.getName()+" обладает большей мощностью магии, чем " + getName());
        }
        if (b1>b2){
            System.out.println(getName()+" трансгрессирует дальше, чем " + students.getName());
        }
        if (b2>b1){
            System.out.println(students.getName()+" трансгрессирует дальше, чем " + getName());
        }
    }
}
