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
    public  void compare(Hogwarts[] students, String name1, String name2) {
        int a1=0;
        int a2=0;
        int b1 = 0;
        int b2 =0;
        for (int i = 0; i < students.length; i++) {
            Hogwarts student = students[i];
            if (name1.equals(student.getName())){
                a1= student.getPowerOfMagic();
                b1=student.getTransgression();
            }
            if (name2.equals(student.getName())){
                a2= student.getPowerOfMagic();
                b2=student.getTransgression();

            }
        }
        if (a1>a2){
            System.out.println(name1+" обладает большей мощностью магии, чем " + name2);
        }
        if (a2>a1){
            System.out.println(name2+" обладает большей мощностью магии, чем " + name1);
        }
        if (b1>b2){
            System.out.println(name1+" трансгрессирует дальше, чем " + name2);
        }
        if (b2>b1){
            System.out.println(name2+" трансгрессирует дальше, чем " + name1);
        }
    }
}
