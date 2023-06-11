public class Main {
    public static void main(String[] args) {
Hogwarts[] students ={
        new Hogwarts("Гарри","Поттер",90,20),
        new Hogwarts("Гермиона","Грейнджер",80,90),
        new Hogwarts("Рон","Уизли",50,10),
        new Hogwarts("Драко","Малфой",60,30),
        new Hogwarts("Грэхэм","Монтегю",40,40),
        new Hogwarts("Грегори","Гойл",10,5),
        new Hogwarts("Захария","Смит",70,50),
        new Hogwarts("Седрик","Диггори",95,95),
        new Hogwarts("Джастин","Финч-Флетчли",30,60),
        new Hogwarts("Чжоу","Чанг",20,70),
        new Hogwarts("Падма","Патил",55,80),
        new Hogwarts("Маркус","Белби",45,55),
};
Gryffindor[] gryffindors={
        new Gryffindor("Гарри","Поттер",90,20,100,90,95),
        new Gryffindor("Гермиона","Грейнджер",80,90,80,100,90),
        new Gryffindor("Рон","Уизли",50,10,80,100,70),
};
Slytherin[]slytherins={
        new Slytherin("Драко","Малфой",60,30,80,
                70,100,60,90),
        new Slytherin("Грэхэм","Монтегю",40,40, 50,
                100,40,30,90),
        new Slytherin("Грегори","Гойл",10,5,40,
                90,90,30,100),
};
Hufflepuff[]hufflepuffs={
        new Hufflepuff("Захария","Смит",70,50,80,90,70),
        new Hufflepuff("Седрик","Диггори",95,95,100,90,80),
        new Hufflepuff("Джастин","Финч-Флетчли",30,60,60,100,90),
};
Ravenclaw[]ravenclaws={
        new Ravenclaw("Чжоу","Чанг",20,70,50,60,70,95),
        new Ravenclaw("Падма","Патил",55,80,80,90,60,65),
        new Ravenclaw("Маркус","Белби",45,55,90,75,80,50),
};

 students[0].print(students);
slytherins[0].print(slytherins);
        hufflepuffs[0].print(hufflepuffs);
        ravenclaws[0].print( ravenclaws);
        gryffindors[2].compare1(gryffindors[0]);

   slytherins[0].compare1(slytherins,"Грегори","Драко");
   hufflepuffs[0].compare1(hufflepuffs,"Седрик","Захария");
     ravenclaws[0].compare1(ravenclaws,"Маркус","Чжоу");
        students[0].compare(students,"Падма","Гарри");


    }
}