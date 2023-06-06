public class PrintService {
    public void print(Hogwarts[] students){
        System.out.println("Количество учеников в Хогвартсе "+students.length);
        for (int i = 0; i < students.length; i++) {
          Hogwarts hogwarts = students[i];
            System.out.println("Имя "+hogwarts.getName()+"; Фамилия "+hogwarts.getSurname()
                    +"; Магическая сила "+hogwarts.getPowerOfMagic()+"; Расстояние трансгрессии "+hogwarts.getTransgression());

        }
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
    public void compare(Gryffindor[] gryffindors,String name1,String name2) {
        int a=0;
        int b = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            if (name1.equals(gryffindor.getName())){
                a=gryffindor.getGenerosity()+gryffindor.getBravery()+ gryffindor.getHonor();
            }
            if (name2.equals(gryffindor.getName())){
                b=gryffindor.getGenerosity()+gryffindor.getBravery()+ gryffindor.getHonor();
            }
        }
        if (a>b){
            System.out.println(name1+" лучше Гриффиндорец, чем " + name2);
        }
        if (b>a){
            System.out.println(name2+" лучше Гриффиндорец, чем " + name1);
        }
    }
    public void compare(Slytherin[] slytherins,String name1,String name2) {
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
    public void compare(Hufflepuff[] hufflepuffs,String name1,String name2) {
        int a=0;
        int b = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            if (name1.equals(hufflepuff.getName())){
                a=hufflepuff.getIndustriousness()+hufflepuff.getLoyalty()+hufflepuff.getHonesty();
            }
            if (name2.equals(hufflepuff.getName())){
                b=hufflepuff.getIndustriousness()+hufflepuff.getLoyalty()+hufflepuff.getHonesty();
            }
        }
        if (a>b){
            System.out.println(name1+" лучше Пуффендуец, чем " + name2);
        }
        if (b>a){
            System.out.println(name2+" лучше Пуффендуец, чем " + name1);
        }
    }
    public void compare(Ravenclaw[] ravenclaws,String name1,String name2) {
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
    public void compare(Hogwarts[] students,String name1,String name2) {
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
